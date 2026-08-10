package ex1_statement.ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 비교값으로 1~12월 사이의 값을 키보드에서 입력
        // 준비된 비교값에 해당하는 월이 몇일까지 있는지 출력
        // ~~~~~~~~~~~~~~


















        int month = 8;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + "월은 31일");

                break;
            case 2:
                System.out.println("2월은 28일");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month + "월은 30일");

                break;

            default:
                System.out.println("올바른 값을 입력하시오");
                break;
        }


        

    }

}
