package ex5_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        

//입력받은 두수의 최소공배수
//====
//수1 : 6
//수2 : 10
//최소공배수 : 30

Scanner sc = new Scanner(System.in);

System.out.print("수1 : ");
int a = sc.nextInt();

System.out.print("수2 : ");
int b = sc.nextInt();

for( int i = 1; i<= a * b; i++){
    
    if (i % a == 0 && i % b == 0 ) {
        System.out.println("최소공배수:"+i);
        break;


        System.out.println("__________");

        while (y-!0) {
            int gcd= x;

            int lcm = (a*b) / gcd;
            System.out.println("최소공배수:"+lcm );
        }
        
    }
}








    }
    
}
