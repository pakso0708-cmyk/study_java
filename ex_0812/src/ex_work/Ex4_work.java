package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        


//배열의 크기를 입력하세요:5
//정수1 : 6
//정수2 : 7
//정수3 : 11
//정수4 : 20
//정수5 : 11


//홀수 개수:3
//짝수 개수;2
Scanner sc = new Scanner(System.in);
System.out.print("배열의 크기를 입력하세요 :");
int a = sc.nextInt();

int[] arr = new int[a];
int odd= 0;
int even = 0;



for (int i = 0; i < a; i++) {
    System.out.printf("정수%d:", i + 1 );
    arr[i] = sc.nextInt();

if(arr[i] % 2 == 0){
    even++;
}else{
    odd++;

}

}

System.out.println("짝수 : " +even);
System.out.println("홀수 : "+ odd) ;

}














    }

