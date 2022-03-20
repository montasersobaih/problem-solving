package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DancingSentence {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        while ((str = b.readLine()) != null) {
            char[] ch = str.replace(" ", "").toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (i % 2 == 0) {
                    ch[i] = Character.toUpperCase(ch[i]);
                } else {
                    ch[i] = Character.toLowerCase(ch[i]);
                }
            }

            StringBuilder string = new StringBuilder(new String(ch));
            for (int i = 0; i < string.length(); i++) {
                if (!Character.toString(str.charAt(i)).equalsIgnoreCase(Character.toString(string.charAt(i)))) {
                    string.insert(i, str.charAt(i));
                }
            }
            System.out.println(string.toString());
        }
    }
}