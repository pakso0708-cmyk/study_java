package ex1_statement;

public class Ex1_for {
        public static void main(String[] args) {
        
            
        //for문 : 특정 코드를 원하느 만큼 반복하고자 할 때
        //for (초기식;조건식;증강식){
        //조건식이 참일 때 수행되는 영역
        //전역변수,지역변수 
        
            //전역변수

            //for 로 넘어갔을때 1. 변수 초기화(int)-> 조건식-> 출력(syso)->증강식->조건식->출력->반복
        for(int i= 0; i<=2; i ++){//지역변수

        System.out.println(i);   
        }
        System.out.println("_______________");
        
        //10~1까지 반복하는 for 문
        for(int a= 10; a >=1; a--){
        
            System.out.println(a);
        }

        System.out.println("______________");

        //1~100까지 반복하는 for문을 만들되
        //5의 배수만 출력

        for(int i=1 ;i <= 100; i++){
            if(i % 5 == 0){
                System.out.println(i);
            }
        }
    System.out.println("_______");
    

    for(int i = 5;i<=100; i+=5){
        System.out.println(i);
    }


    
        } 
    
}
