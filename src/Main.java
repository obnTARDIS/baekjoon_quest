import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        short A = myObj.nextShort(); short B = myObj.nextShort();
        if (A > B) {
            System.out.println(">");
        }
        if (A < B) {
            System.out.println("<");
        }
        if (A == B) {
            System.out.println("==");
        
    }
}
}
