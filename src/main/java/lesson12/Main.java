package lesson12;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] odds = getOddNumbers(2, 7);
        for (int i = 0; i < odds.length; i++) {
            System.out.println(odds[i]);
        }
    }

    public static int[] getOddNumbers(int left, int right) {
        if (left == right) {
            return new int[] {left};
        }
        if (left > right) {
            return new int[] {};
        }

        ArrayList<Integer> odds  = new ArrayList<>();
        for (int i = left; i < right + 1 ; i++) {
            if (i % 2 == 1) {
                odds.add(i);
            }
        }

        return odds.stream().mapToInt(i -> i).toArray();
    }
}
