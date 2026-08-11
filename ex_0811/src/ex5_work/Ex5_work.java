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

int num1 = a;
int num2 = b;

while (b != 0) {
    int temp = a % b;
    a = b;
    b = temp;
}

System.out.println(a);






    }
    
}
