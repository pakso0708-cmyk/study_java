package ex_work;

import java.util.Scanner;

public class Ex6_work {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("등록할 인원수:");
        int n = sc.nextInt();


        String [] info = {"이름:","수학: ","영어:","국어:"};
        String[][] str = new String[n][info.length];

        for(int i = 0; i <str.length;i++){
            for(int j =0;j<str[i].length;j++){

                System.out.print(info[j]);
                str[i][j]= sc.next();

            
        }

        //for (int i = 0; i < str.length; i++) {

            //System.out.print("이름:");
            //str[i][0] = sc.next();

            //System.out.print("수학:");
            //str[i][1] = sc.next();

            //System.out.print("영어:");
           // str[i][2] = sc.next();

          //  System.out.print("국어:");
           // str[i][3] = sc.next();

            System.out.println("---------------");
        }

        System.out.printf("총 %d명의 정보가 등록됨\n", n);
        System.out.println("[ 학생 등록정보 ]");

        for (int i = 0; i < str.length; i++) {

            for (int j = 0; j < str[i].length; j++) {
                System.out.printf("%s\t", str[i][j]);
            }

            System.out.println();
        }
    }
}