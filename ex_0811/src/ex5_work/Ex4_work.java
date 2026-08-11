package ex5_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 두개의 수의 최대 공약수를 출력
        //
        // 수1: 10
        // 수2:4
        // 최대공약수:2

        Scanner sc = new Scanner(System.in);

        System.out.print("수1 : ");
        int a = sc.nextInt();

        System.out.print("수2 : ");
        int b = sc.nextInt();

        while (b != 0) {
            int tehmp = a % b;
            a = b;
            b = tehmp;
        }

        System.out.println("최대공약수: " + a);

    }// main

}
