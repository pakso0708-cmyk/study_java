package ex1_multifor;

public class Ex7_multiFor {
    public static void main(String[] args) {
        

        // 2 x 2 = 4 3 x 2 = 6 4 x 2 = 8
        // 2 x 3 = 6 3 x 3 = 9 4 x 3 = 12 
        // 2 x 4 = 8 3 x 4 = 12 4 x 4 = 16
        // 2 x 5 = 10 3 x 5 = 15 4 x 5 = 20
        // 2 x 6 = 12 3 x 6 = 18 4 x 6 = 24
        // 2 x 7 = 14 3 x 7 = 21 4 x 7 = 28
        // 2 x 8 = 16 3 x 8 = 24 4 x 8 = 32
        // 2 x 9 = 18 3 x 9= 27 4 x 9 = 36


        for (int i=2;i<=9; i++){
            
            for(int j=2;j<=9; j ++){
        
                System.out.printf( "%d :j, 'x' , i ,(j*i)");
                
                
        
            }
            System.out.println();


    }
    
}
}
