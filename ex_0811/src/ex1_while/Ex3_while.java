package ex1_while;

import java.util.Random;
import java.util.Scanner;

public class Ex3_while {

    public static void main(String[] args) {
        

        //1~100 사이의 난수를 만들고
        //키보드에서 입력받은 값이 정답일때 게임을 종료
        //____________________
        //숫자:25
        //up:
        //숫자:70
        //dawn
        //숫자:50
        //정답입니다
        Scanner sc = new Scanner(System.in);

        int answer = new Random().nextInt(bound : 100)+1;
        int num=0;
        while (num != answer) {
            
            System.out.print(" 숫자 : ");
            num= sc.nextInt();
            
            if(num<answer){
                 System.out.println("up");  
            }else if (num > answer){
                 System.out.println("dawn");
            }else{
                System.out.println("정답입니다");
            }

                   
                    
              
                }
            }

}

