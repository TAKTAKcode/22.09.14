package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.print("양의 정수 입력 : ");
            num = sc.nextInt();
        } while (num <= 0);

        int factorial = 1;
        int i = 1;

        /* i가 입력한 num과 같아질때까지 i를 반복하면서 factorial(숫자 1)에 곱하는 형식이다. */
        while (i <= num) {
            factorial *= i;     // factorial에 i 곱하기!
            i++;                // i증가
        }
        System.out.println("1부터 " + num + "까지의 곱은 " + factorial + "입니다!");
    }
}
