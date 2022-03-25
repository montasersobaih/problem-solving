package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowerString {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = b.readLine()).equals(".")) {
            int concatnumber = 1;
            for (int i = 2; i <= str.length(); i++) {
                if (str.length() % i == 0) {
                    int half = (str.length() / i), gate = 1;
                    for (int first = 0, last = half; last < str.length(); first++, last++) {
                        if (str.charAt(first) != str.charAt(last)) {
                            gate = 0;
                            break;
                        }
                    }
                    if (gate == 1) {
                        concatnumber = i;
                    }
                }
            }
            System.out.println(concatnumber);
        }
    }
}