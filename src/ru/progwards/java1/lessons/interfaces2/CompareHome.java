package ru.progwards.java1.lessons.interfaces2;


public class CompareHome {
    public static boolean sameHome(Home h1, Home h2){
        return h1.getHome().equals(h2.getHome());
    }


    public static void main(String[] args) {
        Cow cow1 = new Cow("Пеструшка", 350);
        Duck duck1 = new Duck("Даша", 3);
        Hamster ham1 = new Hamster("Акакий" , 0.25);
        Hawk hawk1 = new Hawk();
        Home [] object = {cow1, duck1, ham1, hawk1};
        System.out.println("Результат сравнения " + object[0].getClass().getSimpleName() + " и " +
                object[1].getClass().getSimpleName() + " равен " + sameHome(object[0],object[1]));

        System.out.println("Результат сравнения " + object[0].getClass().getSimpleName() + " и " +
                object[2].getClass().getSimpleName() + " равен " + sameHome(object[0],object[2]));

        System.out.println("Результат сравнения " + object[0].getClass().getSimpleName() + " и " +
                object[3].getClass().getSimpleName() + " равен " + sameHome(object[0],object[3]));

        System.out.println("Результат сравнения " + object[1].getClass().getSimpleName() + " и " +
                object[2].getClass().getSimpleName() + " равен " + sameHome(object[1],object[2]));

        System.out.println("Результат сравнения " + object[1].getClass().getSimpleName() + " и " +
                object[3].getClass().getSimpleName() + " равен " + sameHome(object[1],object[3]));

        System.out.println("Результат сравнения " + object[2].getClass().getSimpleName() + " и " +
                object[3].getClass().getSimpleName() + " равен " + sameHome(object[2],object[3]));
        }
    }

