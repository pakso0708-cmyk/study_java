package ex5_work;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        //수1 :5
        //수2 :10
        //연산자 : +
        


        //수1 :5
        //수2 : 6 
        //연산자 : a
        //연산기호가 올바르지 않습니다
        // 결과 : -1

        Scanner sc = new Scanner(System.in);
        System.out.println("수1: ");
        int su1= sc.nextInt();

        System.out.println("수2: ");
        int su2= sc.nextInt();
        
        System.out.println("연산자: ");
        String operator = sc.next();

//------------------------------
        CalcuSub cs= new CalcuSub();
        int res = cs.getResult(su1, su2, operator);
        System.out.println("결과: "+res);
    
}
}
