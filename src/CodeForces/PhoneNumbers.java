package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://codeforces.com/contest/151/problem/B">B. Phone Numbers</a>
 * @algorithm Data structure and strings
 * @since 09-11-2022
 */

public class PhoneNumbers {

    private static final List<String> taxi = new LinkedList<>();

    private static final List<String> pizza = new LinkedList<>();

    private static final List<String> girl = new LinkedList<>();

    public static void main(String[] args) throws Exception {
        Reader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        int loop = Integer.parseInt(reader.readLine());

        int mTaxi = 0, mPizza = 0, mGirl = 0;
        while (loop-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

            int numbers = Integer.parseInt(tokenizer.nextToken());
            String name = tokenizer.nextToken();

            int tCount = 0, pCount = 0, gCount = 0;
            while (numbers-- > 0) {
                String number = reader.readLine();
                if (number.matches("(\\d)\\1-\\1\\1-\\1\\1")) {
                    tCount++;
                } else if (isPizzaNumber(number)) {
                    pCount++;
                } else {
                    gCount++;
                }
            }

            mTaxi = tryToAddAndReturnMax(mTaxi, tCount, taxi, name);
            mPizza = tryToAddAndReturnMax(mPizza, pCount, pizza, name);
            mGirl = tryToAddAndReturnMax(mGirl, gCount, girl, name);
        }

        System.out.format("If you want to call a taxi, you should call: %s.%n", String.join(", ", taxi));
        System.out.format("If you want to order a pizza, you should call: %s.%n", String.join(", ", pizza));
        System.out.format("If you want to go to a cafe with a wonderful girl, you should call: %s.%n", String.join(", ", girl));
    }

    private static boolean isPizzaNumber(String phone) {
        phone = phone.replaceAll("-", "");

        for (int i = 1; i < phone.length(); i++) {
            if (phone.charAt(i) >= phone.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }

    private static int tryToAddAndReturnMax(int maxCount, int currentCount, List<String> list, String name) {
        if (currentCount == maxCount) {
            list.add(name);
        } else if (currentCount > maxCount) {
            list.clear();
            list.add(name);
        }

        return Math.max(maxCount, currentCount);
    }
}