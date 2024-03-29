    package ru.progwards.java1.lessons.arrays2;

    import java.util.Arrays;

    public class DIntArray {
        private int[] count  = {};

        public DIntArray() {
        }

        public void add(int num) {
            int [] countCopy = Arrays.copyOf(count, count.length + 1);
            countCopy[countCopy.length - 1] = num;
            count = countCopy;
        }

        public void atInsert(int pos, int num) {
            int[] countCopy = Arrays.copyOf(count, count.length);
            int j = 0;
            for (int i = 0; i < countCopy.length - 1; i++) {

                if (i == pos) {
                    countCopy[i] = num;
                } else {
                    countCopy[i] = count[j];
                    j++;
                }
            }
            count = countCopy;
        }

        public void atDelete(int pos) {
            int i = 0;
            int[] countCopy = Arrays.copyOf(count, count.length);
            for (i = 0; i < pos; i++) {
                if (countCopy[i] == pos)
                    break;
            }
            for (int j = i; j < countCopy.length - 1; j++){
                countCopy[j] = countCopy[j + 1];
            }
            count = countCopy;
        }

        public int at(int pos) {
            return count[pos];
        }
    }