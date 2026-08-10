package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args){
    int a=10;
    int b=12;
    Boolean res3 = ++a >= b || (a-8) + 7 <= b && 13 - b >= 0 && (a+=b) - (a%b) > 10 ? true : false;
    // true && true && true = true -> 'O'
    System.out.println("res3 : " + res3);
    }
}
