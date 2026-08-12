package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        
//입력 : 5 
//ABCDE
//
//

        Scanner sc = new Scanner(System.in);
        System.out.print("입력:");
        int a = sc.nextInt();

        char[] ch = new char[a];
       

        for(int i=0; i<a;i++){
            ch[i] = (char)('A'+i);
        System.out.print( ch[i] );
    }
            System.out.println();
            System.out.println("__________");
            

            char[] cArr = new char [a];
            char arr = 'A';

            for(int i= 0; i < a;i++){

                System.out.print( cArr[i] = arr++);
            }











    }
    
}
