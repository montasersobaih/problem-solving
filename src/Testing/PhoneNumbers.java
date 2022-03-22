package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PhoneNumbers {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine()), maxtaxi = 0, maxpizza = 0, maxgirl = 0;
        ArrayList<String> taxi = new ArrayList<String>(), pizza = new ArrayList<String>(), girl = new ArrayList<String>();
        StringBuilder pTaxi = new StringBuilder(), pPizza = new StringBuilder(), pGirl = new StringBuilder();
        while (loop-- > 0) {
            String[] str1 = b.readLine().split(" ");
            int numbers = Integer.parseInt(str1[0]), taxcount = 0, pizzacount = 0, girlcount = 0;
            while (numbers-- > 0) {
                String num = b.readLine();
                if (num.matches("(\\d)\\1-\\1\\1-\\1\\1")) {
                    taxcount++;
                } else if (check(num)) {
                    pizzacount++;
                } else {
                    girlcount++;
                }
            }

            if (taxcount == maxtaxi) {
                taxi.add(str1[1]);
            } else if (taxcount > maxtaxi) {
                maxtaxi = taxcount;
                taxi.clear();
                taxi.add(str1[1]);
            }

            if (pizzacount == maxpizza) {
                pizza.add(str1[1]);
            } else if (pizzacount > maxpizza) {
                maxpizza = pizzacount;
                pizza.clear();
                pizza.add(str1[1]);
            }

            if (girlcount == maxgirl) {
                girl.add(str1[1]);
            } else if (girlcount > maxgirl) {
                maxgirl = girlcount;
                girl.clear();
                girl.add(str1[1]);
            }
        }

        while (!taxi.isEmpty()) {
            pTaxi.append((!taxi.isEmpty()) ? ", " : "").append(taxi.remove(0));
        }
        while (!pizza.isEmpty()) {
            pPizza.append((!pizza.isEmpty()) ? ", " : "").append(pizza.remove(0));
        }
        while (!girl.isEmpty()) {
            pGirl.append((!girl.isEmpty()) ? ", " : "").append(girl.remove(0));
        }
        System.out.format("If you want to call a taxi, you should call: %s.%n", pTaxi.substring(2));
        System.out.format("If you want to order a pizza, you should call: %s.%n", pPizza.substring(2));
        System.out.format("If you want to go to a cafe with a wonderful girl, you should call: %s.%n", pGirl.substring(2));
    }

    private static boolean check(String phone) {
        phone = phone.replaceAll("-", "");
        for (int i = 1; i < phone.length(); i++) {
            if (phone.charAt(i) >= phone.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}