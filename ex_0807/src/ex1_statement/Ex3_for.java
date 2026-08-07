package ex1_statement;

import java.util.Scanner;

public class Ex3_for {
    public static void main(String[] args) {
        
        //은행 이자가 하루에 1원씩 추가된다.
        //원금과 예치일수를 키보드에서 입력받고
        //예치기한이 끝났을 때 나의 원금이 얼마가 되었는지 출력
        //______________________
        //원금 :1000 
        //:예치일:5
        //결과:5일 후의 잔액은 1005원 입니다
        Scanner sc = new Scanner(System.in);
        System.out.print("원금");
        int a= sc.nextInt();

        System.out.println("예치금");
        int a1=sc.nextInt();
        
        for(int i =1; i<=a1;i++){
            i+=1;
            
        }
            System.out.println(a1+"일후의 잔액은"+(a+a1));








    }
    
}
