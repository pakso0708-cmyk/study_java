package ex3_continue;

public class Ex1_continue {
    public static void main(String[] args) {
        

//continue문
//반복문에 나에게 특정 코드를 건너뛰고자 할 때

for(int i=1;1<=2;i++){
    for(int j=1; j<=5;  ){
        
        j++;
        
        if (j%2==0) {
            
            //for문 안에서 continue 를 만나면 가까운 for문으로 뭐시기어쩌구 ㄴ
            continue;    
        }
System.out.print(j+" ");

    }
    System.out.println();
}














    }
}
