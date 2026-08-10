package ex1_multifor;

public class Ex7_nultiFor {
    public static void main(String[] args) {
        

        // 2 x 2=4 3 x 2=6 4 x 2 =8
        // 2 x 3= 6 3 x 3 = 9
        //....
        // ...
        //2 x 9= 18 3 x 9= 27...


        for (int i=2;i<=9; i++){
            
            for(int j=2;j<=9; j ++){
        
                System.out.println(i + " x " + j + " = " + (i * j));
                
                
        
            }
            System.out.println();


    }
    
}
}
