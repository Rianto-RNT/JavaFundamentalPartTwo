import java.text.NumberFormat;

public class FormatingNumber {

    public static void main(String[] args) {
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
