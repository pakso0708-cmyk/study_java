package ex2_break;

public class Ex1_break {
    public static void main(String[] args) {
        
        //break는 반복문에서 강제적으로
        //가장 가까운 반복문을 빠져나갈때 사용
        for(int i= 1 ;i<=3;i++){

            for(int j =1;j <= 10; j++){

                if (j %2 == 0) {
                    break;
                }

                System.out.print(j+"");



            }
            System.out.println();
        }
    }
    
}


//i=1
//j=1
//