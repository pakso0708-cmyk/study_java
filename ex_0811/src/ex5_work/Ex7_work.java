import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
//1부터 입력받은 숫자까지 값을 순차적으로 출혁하되
//5의 배수이거나, 1의자리가 3인경우에는 제외

//입력:15
//1
//2
//4
//6
//7
//8
//9
//11
//12
//14
Scanner sc =new Scanner(System.in);
System.out.print("입력:");

int a= sc.nextInt();

for(int i= 1;i<=a;i++){
    if i % 5 == 0 || i % 10 ==3)
   continue;

}
System.out.println(i);



    }
    
}
