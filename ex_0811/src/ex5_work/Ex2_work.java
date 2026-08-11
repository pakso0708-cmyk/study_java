package ex5_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {
        


        //1부터 사용자가 입력한 숫자까지
        //3의 배수의 갯수, 5의 배수의 갯수를 출력
        //______________
        //정수:70
        //3의 배수:23
        //5의 배수:14
        Scanner sc=new Scanner(System.in);
        System.out.print("정수: ");
        int num = sc.nextInt();

        int count3 = 0;
        int count5 = 0;

        // 1부터 입력한 숫자까지
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                count3++;
            }

            if (i % 5 == 0) {
                count5++;
            }
        }

        System.out.println("정수: " + num);
        System.out.println("3의 배수: " + count3);
        System.out.println("5의 배수: " + count5);
        




    }
    
}
