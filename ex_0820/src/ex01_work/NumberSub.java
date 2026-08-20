package ex01_work;

public class NumberSub {

public boolean isNumber(String num){



   
        for ( int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;

    }
    
}
