package ex5_work;

public class CalcuSub {

    public int getResult(int su1, int su2, String operator) {

        switch (operator) {
            case "+":
                return su1 + su2;

            case "-":
                return su1 - su2;

            case "*":
                return su1 * su2;

            case "/":
                return su1 / su2;

            default:
                System.out.println("연산기호가 올바르지 않습니다");
                return -1;

        }
    }
}
