public class Casting {

    public static void main(String[] args) {

        // Implicit casting
        // byte > sort > int > long > float > double
//        short x = 1;
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;

        System.out.println(y);
    }
}
