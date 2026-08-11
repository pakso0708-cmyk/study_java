package ex1_while;

import java.util.Scanner;

public class Ex1_while {
    public static void main(String[] args) {
        //while 문: 간단한 구성을 가진 반복문
        //선 비교 후 처리

        int num=1;


        while (num <= 4) {
            System.out.println(num);
            num++;

            System.out.println( "________");


            Scanner sc = new Scanner(System.in);
            

            while (true) {
            
                System.out.print("홀수:  ");
                int num2= sc.nextInt();
                System.out.println(num2);1
            }
        }
        


    }
    
}
