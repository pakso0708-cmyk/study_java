package ex_work;

import java.util.Scanner;

public class Ex05-work {
    main

//찾을값 :10
//  10보다 큰 첫번째 요소:7
//해당 행의 모든 요소
//5 6 7 8

    int[][] array= {{1, 2, 3, 4},
                 {5, 6, 7, 8},
                 {9, 10, 11, 12},
                {13, 14, 15, 16}  };

                Scanner sc= new Scanner(System.in);
                System.out.print("찾을값:");
                num = sc.nextInt();
            
                
                                           
               out: for (int i = 0; i<array.length ;i++){
                        for(int j =0;j<array.length;j++){
                            if (array[i][j] > num) {
                                System.out.printf("%d보다 큰숫자 오쇼:");
                                System.out.println("해당 행의 모든 요소");

                                for(int k =0;k<array[i].length; k++ ){
                                    System.out.print(array[i][k]+ " ");
                                }
                                        break out;

                            }
                    
                            }

                            }






                        }


                }  

                 









                 }
