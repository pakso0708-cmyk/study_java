package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        //제어문 - 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉨
        //분기문 : if, switch
        //반복문 : for, while, do-while

        //if문
        //if(조건식){
        // 조건식이 참일 때 실행되는 영역
        //}
        // String : 쌍따옴표안에 여러 문자를 저장하는 자료형

        int n = 49;
        String str = "";

        if(n == 50){
            str = "n = 50입니다";
        }
        
        if( n != 50 ){
            str = "n은 50이 아닙니다";
        }
        System.out.println(str);
    }
}
