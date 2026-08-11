package ex1_while;

import java.util.Random;

public class Ex5_do_while {
    public static void main(String[] args) {
        
        //자바,jsp,안드로이드의 시험을 봤다/
        // 각 과목별 점수를 랜덤하게 0~130점에 대입
        //각 과목별 점수를 검사하여
        //최종 결과를 화면에 출력
        //자바 : 30
        //jsp : 100
        //안드:13

        int java= 0;
        int jsp = 0;
        int and = 0;

        do{
            java=new Random().nextInt(131);
            jsp=new Random().nextInt(131);
            and=new Random().nextInt(131);

            
        }while(java >100|| jsp>100||and>100);
        System.out.println("자바:"+java);
        System.out.println("jsp:"+jsp);
        System.out.println("안드로이드"+and);

        





    }
    
}
