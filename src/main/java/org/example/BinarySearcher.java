package org.example;

public class BinarySearcher {

    /**
     * Этот метод возвращает индекс найденного элемента, в противном случае возвращает -1.
     * Реализация итеративная (через цикл).
     * */
    public static int iterativeBinarySearch(int[] array, int value) {
        int low = 0;
        int high = array.length;

        do {
            int middleIndex = (low + high) / 2;
            var middle = array[middleIndex];

            if (middle == value) {
                return middleIndex;
            }

            if (middle < value) {
                low = middleIndex + 1;
            } else {
                high = middleIndex;
            }

        } while (low < high);

        return -1;
    }

    /**
     * Этот метод возвращает индекс найденного элемента, в противном случае возвращает -1.
     * Использует внутренний рекурсивный метод internalRecursiveBinarySearch.
     * */
    public static int recursiveBinarySearch(int[] array, int value) {
        return internalRecursiveBinarySearch(array, value, 0, array.length);
    }

    private static int internalRecursiveBinarySearch(int[] array, int value, int low, int high) {
        if (low >= high) {
            return -1;
        }

        int middleIndex = (low + high) / 2;
        var middle = array[middleIndex];

        if (middle == value) {
            return middleIndex;
        }

        if (middle < value) {
            return internalRecursiveBinarySearch(array, value, middleIndex + 1, high);
        } else {
            return internalRecursiveBinarySearch(array, value, low, middleIndex);
        }
    }
}
