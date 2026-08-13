package ex1_multArr;

public class Ex1_multiArr {
    public static void main(String[] args) {
        

        int[][] test = new int [2][3];
        test[0][0] = 100;
        test[0][1] = 200;
        test[0][2] = 300;

        test[1][0] = 400;
        test[1][1] = 500;
        test[1][2] = 600;

        for(int i = 0; i <2;i++){
            
            for(int j = 0; j<3; j++){

                System.out.print(test [i][j]+ " ");


            }
            System.err.println();


        }
    
    }
    
}
