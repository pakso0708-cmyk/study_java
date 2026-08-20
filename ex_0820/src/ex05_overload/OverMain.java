package ex05_overload;

public class OverMain {
    public static void main(String[] args) {
        
        OverSub os = new OverSub();
        os.result();
        os.result(100);
        os.result('a');
        os.result("a");
        os.result(1,"a");
        os.result("a",1);

        System.out.println();
    }
}
