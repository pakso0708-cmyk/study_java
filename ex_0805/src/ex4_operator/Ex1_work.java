package ex4_operator;

public class Ex1_work {
    public static void main(String[] args) {
         /*
    과수원이 있다.
    배, 사과, 오렌지를 키우고 있는데, 하루에 생산되는 양이
    각각 5, 7, 5개

    1. 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
    2. 시간당 전체 과일의 평균 생상 갯수
    단, 과일의 갯수를 담는 변수는 int, 평균을 계산할 변수는 float

     */
    int pear = 5;
    int apple = 7;
    int orange = 5;
    int sum = pear + apple + orange;
    
    //float avg = (float)sum / 24;
    float avg = sum / 24f;
    System.out.println("총 갯수 : " + sum);
    System.out.println("시간당 생성 갯수 : " + avg);
    }
   

}
