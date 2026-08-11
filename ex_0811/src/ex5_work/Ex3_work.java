package ex5_work;

public class Ex3_work {
    public static void main(String[] args) {
        
        //주사위 두 개를 던졌을 때
        //합이 5, 6, 7이 되는 경우의 수를 찾아 출력

        //5: 1 4 2 3 3 2 4 1
        //6: 1 5 2 4 3 3 4 2 5 1
        //7: 1 6 2 5 3 4 4 3 5 2 6 1

        String five = "";
        String six = "";
        String seven = "";

        for (int d1 = 1; d1 <= 6; d1++) {
            for (int d2 = 1; d2 <= 6; d2++) {

                int res = d1 + d2;

                switch (res) {
                    
                    case 4:
                     += d1 + " " + d2 + "  ";
                        break;
                    
                    
                    case 5:
                        five += d1 + " " + d2 + "  ";
                        break;

                    case 6:
                        six += d1 + " " + d2 + "  ";
                        break;

                    case 7:
                        seven += d1 + " " + d2 + "  ";
                        break;
                }
            }
        }

        System.out.println("5: " + five);
        System.out.println("6: " + six);
        System.out.println("7: " + seven);
    }
}