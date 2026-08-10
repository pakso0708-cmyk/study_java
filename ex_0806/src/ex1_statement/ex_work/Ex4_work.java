package ex1_statement.ex_work;


import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {
        
        //수1 : 10
        //수2 : 20
        //연산자 :+
        //10 + 20= 30

        Scanner sc = new Scanner(System.in);
        System.out.println("수1:");
        int a1= sc.nextInt();

        System.out.println("수2:");
        int a2= sc.nextInt();
        

        System.out.println("연산자:");
        String operator = sc.next();

        switch (operator) {
            case "+" :
            System.out.println(a1+"+"+a2+"="+(a1+a2));
                break;

                case "-" :
                    System.out.println(a1+"-"+ a2 + "="+(a1-a2));
            
                break;
                case "*" :
            System.out.println(a1+"*"+a2+"="+(a1*a2));

                break;
                case "/" :
            System.out.println(a1+"/"+a2+"="+((float)a1/a2 ));
                break;

        
            default:
                System.out.println("올바른값을 입력하시오");
                break;
        }


        


       
        }




    
    
}
