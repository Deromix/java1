package ru.progwards.java1.lessons.params;

class IntInteger extends AbsInteger {
        private int val;

        public int getValue() {
            return val;
        }

        public IntInteger(int val) {
            this.val = val;
        }

        @Override
        public String toString() {
        return String.valueOf(val);
    }
}

