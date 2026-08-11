package ex2_break;

public class Ex2_break {
    public static void main(String[] args) {
        
        for(int i= 1; i<=3;i++){

            switch (i) {
                case 1:
                    System.out.println("class 1");
                    break;
                    //반복문에서 스위치 문의 break는 
                    //반복문이 아닌 현재 switch문을 빠져나가는
                    //용도로 사용된다
                case 2:
                    System.out.println("class 2");
                
                    break;
            }
            
        }
        System.out.println();



    }
    
}
