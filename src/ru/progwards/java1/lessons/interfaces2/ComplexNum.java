package ru.progwards.java1.lessons.interfaces2;

public class ComplexNum implements ToString {
    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;

    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String getString() {
        return toString();
    }

    public String toString(){
        String a1;
        String b1;
        a1 = Integer.toString(a);
        b1 = Integer.toString(b);
        return a1 +"+" + b1 +"i";
    }

    public ComplexNum add(ComplexNum num)
    //сложение комплексных чисел по формуле:
    //(a + bi) + (c + di) = (a + c) + (b + d)i
    {
         return new ComplexNum(a + num.getA(), b + num.getB());
    }

    public ComplexNum sub(ComplexNum num)
    //вычитание комплексных чисел по формуле:
    // (a + bi) - (c + di) = (a - c) + (b - d)i
    {
        return new ComplexNum(a - num.getA(), b - num.getB());
    }

    public ComplexNum mul(ComplexNum num)
    // Умножение комплексных чисел по формуле:
    // (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
    {
        return new ComplexNum((a * num.getA()) - (b * num.getB()) , (b * num.getA()) + (a * num.getB()));
    }

    public ComplexNum div(ComplexNum num)
    //  комплексных чисел по формуле:
    // (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    {
        return new ComplexNum(((a * num.getA()) + (b * num.getB())) / ((num.getA() * num.getA()) + (num.getB() * num.getB())) , ((b * num.getA()) - (a * num.getB())) / ((num.getA() * num.getA()) +(num.getB() *num.getB())));
    }


    public static void main(String[] args) {
        ComplexNum div = new ComplexNum(1,56);
        ComplexNum t2 = new ComplexNum(1,56);
        System.out.println(new ComplexNum(1000, 1000).div(new ComplexNum(100, 100)).toString());
    }

}
