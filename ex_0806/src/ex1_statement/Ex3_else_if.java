package ex1_statement;

public class Ex3_else_if {
    public static void main(String[] args) {
        
        //다중 if문( else if)
        //여러 개의 조건 비교가 필요한 경우 사용하는 if문

    //if (조건식1){}
    // 조건식1이 참일 때 실행되는 영역

    //} else if( 조건식2 ){
    // 조건식2가 참일때 실행되는 영역
    //}
    int num = 50;
    String str = "";
    if( num >= 90){
        str = "A";
    }else if(num >= 80){
        str = "B";
    }else if(num >= 70){
        str = "C";
    }else if(num >= 60){
        str = "D";
    }else{
        str = "F";
    }
    System.out.println("당신의 학점은 " + str + "입니다");

 //나이가 20 이상 -> 성인요금
 //14이상 20 미만 -> 청소년 요금
 //8이상 14미만 -> 어린이 요금
//8미만 -> 유아요금
int age1 = 13;
String fee = "";

if(age1 >= 20){
    fee = "성인요금";
}else if(age1 >= 14){
    fee = "청소년 요금";
}else if(age1 >= 8){
    fee = "어린이 요금";
}else{
    fee = "유아요금";
}
System.out.println(fee);

}
}