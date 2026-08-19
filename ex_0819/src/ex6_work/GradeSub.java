package ex6_work;

public class GradeSub {
    
    public int myPoint(int money,String membership){

        if (membership.equalsIgnoreCase("vip")) {
           return money *10 / 100;
                
                
        }else if(membership.equalsIgnoreCase("gold")){
            return money *5 / 100;
        }else if(membership.equalsIgnoreCase("silver")){
            return money *3 / 100;
        }else{
            System.out.println("회원등급이 올바르지 않습니다");
                return 0;
            
        }

    }


}
