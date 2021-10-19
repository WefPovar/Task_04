package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите длину последовательности: ");
        int n = readNum();

        int ans = countSequence(n);
        writeAnswer(ans);
    }

    private static int readNum(){
        Scanner scn = new Scanner(System.in);

        return scn.nextInt();
    }

    private static int countSequence(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int temp = 1;
            for (int j = i; j <= 2 * i; j++){
                temp *= j;
            }
            sum += temp;
        }
        return sum;

    }

    private static void writeAnswer(int ans) {
        System.out.println("Сумма последовательностей равна: " + ans);
    }
}
