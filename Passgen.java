import java.util.Random;
public class Passgen{
    public static String Generate(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
            }
            return sb.toString();
            }
            public static void main(String[] args) {
                System.out.println("Your password is: " + Generate(10));

    }
}
