public class SwitchStatements {

    public static void main(String[] args) {
        String role = "saprol";

        switch (role) {
            case "Admin":
                System.out.println("You're an Admin");
                break;
            case "Moderator":
                System.out.println("You're a Moderator");
                break;
            default:
                System.out.println("You're a Guest");

        }
    }
}
