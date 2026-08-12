package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {

        // 학생 수를 입력하세요:3
        // 학생 1의 성적:90
        // 학생 2의 성적:73
        // 학생 3의 성적:84

        // 평균 성적: 82.3333
        // ----평균 이상인 학생들---
        // => 학생1:90
        // => 학생3:84
        // 평균 이상인 학생 수 :2

        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("학생%d의 성적:", i + 1);
            arr[i] = sc.nextInt();

            sum += arr[i];

        }
        System.out.println("----------");
        float avg = (float)sum / n;
        System.out.printf( "평균성적: %.2f\n",avg);

        System.err.println("---평균 이상인 학생들 ---");
        int avgCnt = 0; 

        for(int i = 0; i <n; i++){
            
            if ( arr[i] >= avg) {
                avgCnt++;
                System.out.printf("=> 학생%d : %d\n",i+1,arr[i]);
                
            }
        }
System.out.println("평균 이상의 학생 수 :"+ avgCnt);
    }
}
