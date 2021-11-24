import java.util.Locale;

public class Strings {
    public static void main(String[] args) {

        String message = "Hello World" + "!!";

        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("W"));
        System.out.println(message.indexOf("Sky"));
        System.out.println(message.replace("!", "?"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase(Locale.ROOT));
        System.out.println(message.trim());


    }
}
