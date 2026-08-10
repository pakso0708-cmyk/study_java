package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
        
        /* 
        자바의 기본 자료형
        논리형 : boolean .... 1bit
        문자형 : char ....... 2bte
        정수형 : byte ....... 1byte -> -128 ~ 127 까지 담을 수 있음
                short ...... 2byte -> -32768 ~ 32767
                int ........ 4byte -> 대략 -21억 ~ 21억
                long ....... 8byte -> -922경 ~ 922경
        실수형 : float ...... 4.x byte -> 
                double ..... 8.x byte -> 
        
        
        변수(용도에 따라 이름표 역할) : 데이터를 저장하는 공간
        자료형 변수명;(선언)
        변수명 = 값; (대입)

        자료형 변수명 = 값; (선언과 대입을 한줄로 -> 초기화라고 함)

        변수선언 규칙
        1. 숫자로 시작할 수 없다.
        2. _를 제외하고 특수문자를 사용할 수 없다. (공백도 X)
        3. 한글로 변수이름 짓지 않는다.
        4. 반드시 소문자 알파벳으로 시작하도록 한다.
        */
       //논리형 : 참과 거짓(true,false)의 두 가지 값만을 
       //저장할 수 있는 자료형
       boolean b1; //선언
       b1 = true; //대입
       b1 = false;
       //b1 = 10; -> 자료형 타입이 올바르지 않기때문에 오류발생
       System.out.println("b1 : " + b1);

       //정수형 : 소수점이 없는 정수값만 저장하는 자료형
       byte b = 127;
       short s = 32767;
       int n = 5000;
       long lo = 2200000000L;
       System.out.println("b : " + b);
       System.out.println("s : " + s);
       System.out.println("n : " + n);
       System.out.println("lo : " + lo);
    }
}
