import java.util.*;

public class caesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write your message: ");
        String s = sc.nextLine();
        System.out.print("key: ");
        int shift = sc.nextInt();

        String encodedmsg = encoded(s, shift);
        System.out.println("Encoded message: " + encodedmsg);
        sc.close();
    }

    public static String encoded(String s, int shift) {
        String encodedmsg = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c = (char) (97 + (c - 97 + shift) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (65 + (c - 65 + shift) % 26);
            }
            encodedmsg += c;
        }

        return encodedmsg;
    }
}