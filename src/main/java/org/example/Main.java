package org.example;

import static org.example.BinarySearcher.*;

public class Main {
    public static void main(String[] args) {
        var array = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        var target = 2;
        System.out.println(iterativeBinarySearch(array, target));
        System.out.println(recursiveBinarySearch(array, target));
    }
}