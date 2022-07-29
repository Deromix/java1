package ru.progwards.java1.lessons.inheritance;

public class TimeZone {
    int hours; //часовой сдвиг, может быть отрицательным
    int minutes; //сдвиг в минутах

    public TimeZone(int hours) {
        this.hours = hours;
        this.minutes = 0;
    }

    public TimeZone(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        if (minutes < 0) {
            minutes = minutes * -1;
            hours = hours * -1;
        }
    }

    class ZonedTime extends Time {
        TimeZone zone;

        public ZonedTime(int hours, int minutes, int seconds) {
            super(hours, minutes, seconds);
            this.zone = getTimeZone();
        }

        public ZonedTime(int hours, int minutes, int seconds, TimeZone zone) {
            super(hours, minutes, seconds);
            this.zone = zone;
        }

        @Override
        public TimeZone getTimeZone() {
            return zone;
        }


        @Override
        public int secondsBetween(Time time) {
            TimeZone k1 = this.getTimeZone();
            TimeZone k2 = time.getTimeZone();
            return (k1.hours * 60 * 60 + k1.minutes * 60) - (k2.hours * 60 * 60 + k2.minutes * 60);
        }


        public static void main(String[] args) {
            ZonedTime t1 = new ZonedTime(2,4, 4);
            ZonedTime t2 = new ZonedTime(1,2,3);
            System.out.println(t1.secondsBetween(t2));
        }
    }
}



