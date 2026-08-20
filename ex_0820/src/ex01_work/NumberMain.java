package ex01_work;

import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {

        // 값 : 100
        // 100은(는) 숫자입니까? true

        // 값 : abc123
        // abc123은(는) 숫자입니까? false
        Scanner sc = new Scanner(System.in);
        System.out.print("값: ");
        String num = sc.next();

        NumberSub ns =new NumberSub();
       // boolean res = ns.isNumber(num);

        System.out.println(num + "은(는) 숫자입니까? :"+ ns.isNumber(num));



        // int i = 0;
        // for (; i < num.length(); i++) {
        //     char ch = num.charAt(i);

        //     if (ch < '0' || ch > '9') {
        //         break;

        //     }

        // }

        // if (i == num.length()) {
        //     System.out.println(num + "은(는) 숫자입니까? true");

        // } else {
        //     System.out.println(num + "은(는) 숫자입니까? false");
        // }

    }

}
