import java.util.Locale;
import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = "";
        while (!inputs.equals("quit")) {
            System.out.println("Input: ");
            inputs = scanner.next().toLowerCase();
            System.out.println(inputs);
        }
    }
}
