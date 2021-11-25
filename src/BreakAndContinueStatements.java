import java.util.Scanner;

public class BreakAndContinueStatements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputs = "";
        while (true) {
            System.out.println("Input: ");
            inputs = scanner.next().toLowerCase();
            if (inputs.equals("pass"))
                continue;
            if (inputs.equals("quit"))
                break;

                System.out.println(inputs);
        }
    }
}
