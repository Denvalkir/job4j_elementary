package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {  // ищем null
            if (array[i] == null) {
                int nullIndex = i; /* указатель на null ячейку. */
                int notNullIndex = notNullIndex(array, i); // через метод после null ищем следующий индекс не null

                if (notNullIndex > 0) {                    // проверка, что в конце еще есть не null строки
                    swap(array, nullIndex, notNullIndex);  // если есть, то делаем обмен индексами
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int notNullIndex(String[] array, int index) {
        int rsl = -1;
        for (int i = index; i < array.length; i++) {
            if (array[i] != null) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public static String[] swap(String[] array, int nullIndex, int notNullIndex) {
        String temp = array[nullIndex];
        array[nullIndex] = array[notNullIndex];
        array[notNullIndex] = temp;
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}