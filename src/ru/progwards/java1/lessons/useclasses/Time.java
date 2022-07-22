package ru.progwards.java1.lessons.useclasses;

public class Time {
    int hours;
    int minutes;
    int seconds;
    public Time(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString(){
        String hour;
        String minute;
        String second;
        hour = Integer.toString(hours);
        minute = Integer.toString(minutes);
        second = Integer.toString(seconds);

        if(hours < 10) {
            hour = "0" + hours;
        }
        if (minutes < 10) {
            minute = "0" + minutes;
        }
        if (seconds < 10) {
            second = "0" + seconds;
        }
        return hour + ":" + minute + ":" + second;
    }

    public int toSeconds(){
        return hours * 60 * 60 + minutes * 60 + seconds;
    }
    public int secondsBetween(Time time){
        if(this.toSeconds() > time.toSeconds())
            return this.toSeconds()- time.toSeconds();
        else
            return time.toSeconds()- this.toSeconds();

    }

    public static void main(String[] args) {
        Time t1 = new Time(2,30,5);
        Time t2 = new Time (1,3,4);
        System.out.println(t1.toString());
        System.out.println(t1.toSeconds());
        System.out.println(t1.secondsBetween(t2));

    }
}
