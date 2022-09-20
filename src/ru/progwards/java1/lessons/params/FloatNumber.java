package ru.progwards.java1.lessons.params;


import java.util.Arrays;


public class FloatNumber {
        String exp;
        String mantissa;
        boolean sign;

    public FloatNumber(String number) {
        //Привести число к нужному формату.
        double d = Double.parseDouble(number);
        String temp = String.format("%1E",d).replace(',','.');

        //Разделить строку на мантиссу и степень числа.
        int i = temp.indexOf('E');
        exp = temp.substring(i + 1);
        mantissa = temp.substring(0, i);

        //Да, ещё знак нужен.
        String s = mantissa.charAt(0) == '-' ? "-" : "";
        sign = !s.equals("-");

    }

        @Override
        public String toString() {
            return mantissa + "E" + exp;
        }

        static Double toDouble(FloatNumber floatNumber) {
            int p =  floatNumber.toString().indexOf("+");
            String i = floatNumber.toString().substring(0, p);
            String y = floatNumber.toString().substring(p+1);
            String iy = i + y;
            double d = Double.parseDouble(iy);
            return d;
        }
    public void fromDouble(double num) {
        String d = String.valueOf(num);
        char[] chars = d.toCharArray();
        if (chars[0] != '-') { // положительное число
            this.sign = true;
            int dot = d.indexOf(".");
            int ex = d.indexOf("E");
            if (ex != -1) { //есть степень e

                if (dot != -1) { // есть точка
                    exp = d.substring(ex + 1);
                    String tmp = d.substring(0, dot);
                    mantissa = String.valueOf(Long.parseLong(tmp + d.substring(dot + 1, ex)));
                } else { // есть е и нет точки
                    exp = d.substring(ex + 1);
                    mantissa = String.valueOf(Long.parseLong(d.substring(0, ex)));
                }
            } else { // нет е
                if (dot != -1) { // нет е, но есть точка
                    if (chars[0] == '0')
                        exp = String.valueOf(-1); // сдвиг точки вправо
                    else
                        exp = String.valueOf(dot - 1); // длина строки минус 1 цифра и точка
                    String tmp = d.substring(0, dot);
                    mantissa = String.valueOf(Long.parseLong(tmp + d.substring(dot + 1)));
                } else { // нет е и нет точки
                    exp = String.valueOf(chars.length - 1);
                    mantissa = String.valueOf(Long.parseLong(d));
                }
            }
        }
        if (chars[0] == '-') { // отрицательное число
            this.sign = false;
            int dot = d.indexOf(".");
            int ex = d.indexOf("E");
            if (ex != -1) { //есть степень e
                if (dot != -1) { // есть точка
                    exp = d.substring(ex + 1);
                    String tmp = d.substring(1, dot);
                    mantissa = String.valueOf(Long.parseLong(tmp + d.substring(dot + 1, ex)));
                } else { // есть е и нет точки
                    exp = d.substring(ex + 1);
                    mantissa = String.valueOf(Long.parseLong(d.substring(1, ex)));
                }
            } else { // нет е
                if (dot != -1) { // нет е, но есть точка
                    if (chars[1] == '0')
                        exp = String.valueOf(-1); // сдвиг точки вправо
                    else
                        exp = String.valueOf(dot - 1); // длина строки минус 1 цифра и точка
                    String tmp = d.substring(1, dot);
                    mantissa = String.valueOf(Long.parseLong(tmp + d.substring(dot + 1)));
                } else { // нет е и нет точки
                    exp = String.valueOf(chars.length - 1);
                    mantissa = String.valueOf(Long.parseLong(d));
                }
            }
        }
    }

    public static void negative(FloatNumber num){
        double x = toDouble(num) * -1;
        num.mantissa = String.valueOf(x);
    }

    public  FloatNumber add(FloatNumber num){
        double a = toDouble(num) + toDouble(this);

        FloatNumber fn1 = new FloatNumber(String.valueOf(a));
        return fn1;
    }

    public FloatNumber sub(FloatNumber num){
        double s1 = toDouble(num);
        negative(num);
        double s2 = toDouble(num);
        double s = s1 + s2;
        FloatNumber fn1 = new FloatNumber(String.valueOf(s));
        return fn1;
    }


        public static void main(String[] args) {
            System.out.println(new FloatNumber("-123.45456e7"));
            System.out.println(new FloatNumber("-12e7"));
            System.out.println(new FloatNumber(" -123.45456"));
            System.out.println(new FloatNumber(" 123"));
            System.out.println(new FloatNumber(" 0"));
            FloatNumber fn3 = new FloatNumber(" -123.45456E7");
            double x = toDouble(fn3);
            System.out.println(x);
            FloatNumber fn2 = new FloatNumber( "12e7");
            System.out.println(fn3.add(fn2).toString());
            negative(fn2);
            System.out.println(fn2.toString());
        }
    }
