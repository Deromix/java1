package ru.progwards.java1.lessons.params;


import java.util.Arrays;


public class FloatNumber {
        int exp;
        long mantissa;
        boolean sign;

    public FloatNumber(boolean sing, long mantissa, int exp){
        this.sign = sign;
        this.mantissa = mantissa;
        this.exp = exp;
    }

    public FloatNumber(String number) {
        //Привести число к нужному формату.
        double d = Double.parseDouble(number);
        String temp = String.format("%1E",d).replace(',','.');

        //Разделить строку на мантиссу и степень числа.
        int i = temp.indexOf('E');
        exp = Integer.parseInt(temp.substring(i + 1));
        mantissa = Long.parseLong(temp.substring(0, i));

        //Да, ещё знак нужен.
        String s = String.valueOf(mantissa).charAt(0) == '-' ? "-" : "";
        sign = !s.equals("-");

    }

        @Override
        public String toString() {
            return mantissa + "E" + exp;
        }

        Double toDouble() {
            String s = String.valueOf(mantissa + exp);
            double d = Double.parseDouble(s);
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
                    exp = Integer.parseInt(d.substring(ex + 1));
                    String tmp = d.substring(0, dot);
                    mantissa = Long.parseLong(tmp + d.substring(dot + 1, ex));
                } else { // есть е и нет точки
                    exp = Integer.parseInt(d.substring(ex + 1));
                    mantissa = Long.parseLong(d.substring(0, ex));
                }
            } else { // нет е
                if (dot != -1) { // нет е, но есть точка
                    if (chars[0] == '0')
                        exp = -1; // сдвиг точки вправо
                    else
                        exp = dot - 1; // длина строки минус 1 цифра и точка
                    String tmp = d.substring(0, dot);
                    mantissa = Long.parseLong(tmp + d.substring(dot + 1));
                } else { // нет е и нет точки
                    exp = chars.length - 1;
                    mantissa = Long.parseLong(d);
                }
            }
        }
        if (chars[0] == '-') { // отрицательное число
            this.sign = false;
            int dot = d.indexOf(".");
            int ex = d.indexOf("E");
            if (ex != -1) { //есть степень e
                if (dot != -1) { // есть точка
                    exp = Integer.parseInt(d.substring(ex + 1));
                    String tmp = d.substring(1, dot);
                    mantissa = Long.parseLong(tmp + d.substring(dot + 1, ex));
                } else { // есть е и нет точки
                    exp = Integer.parseInt(d.substring(ex + 1));
                    mantissa = Long.parseLong(d.substring(1, ex));
                }
            } else { // нет е
                if (dot != -1) { // нет е, но есть точка
                    if (chars[1] == '0')
                        exp = -1; // сдвиг точки вправо
                    else
                        exp = dot - 1; // длина строки минус 1 цифра и точка
                    String tmp = d.substring(1, dot);
                    mantissa = Long.parseLong(tmp + d.substring(dot + 1));
                } else { // нет е и нет точки
                    exp = chars.length - 1;
                    mantissa = Long.parseLong(d);
                }
            }
        }
    }

    public void negative(){
        double x = this.mantissa * -1;
        this.mantissa = (long)x;
    }

    public  FloatNumber add(FloatNumber num){
        double a = num.toDouble() + this.toDouble();

        FloatNumber fn1 = new FloatNumber(String.valueOf(a));
        return fn1;
    }

    public FloatNumber sub(FloatNumber num){
        double s1 = num.toDouble();
        num.negative();
        double s2 = num.toDouble();
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
            double x = fn3.toDouble();
            System.out.println(x);
            FloatNumber fn2 = new FloatNumber( "12e7");
            System.out.println(fn3.add(fn2));
            fn2.negative();
            System.out.println(fn2);
        }
    }
