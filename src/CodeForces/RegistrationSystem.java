package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962786258874
 * @link https://codeforces.com/group/MUjDsRjHXt/contest/302066/problem/C
 * @since 01-06-2022
 */

public class RegistrationSystem {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> db = new HashMap<>();
        int tc = Integer.parseInt(reader.readLine());
        while (tc-- > 0) {
            String username = reader.readLine();

            String message = "OK";
            Integer counter = db.putIfAbsent(username, 1);
            if (counter != null) {
                message = username + counter++;
                db.put(username, counter);
            }

            System.out.println(message);
        }
    }
}
