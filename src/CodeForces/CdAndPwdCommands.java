package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CdAndPwdCommands {
    public static void main(String[] args) throws Exception {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(b.readLine());
        ArrayList<String> ar1 = new ArrayList<>();
        while (loop-- > 0) {
            String str1 = b.readLine(), str2;
            if (str1.startsWith("cd")) {
                if ((str1 = str1.replace("cd", "").trim()).startsWith("/")) {
                    StringTokenizer token = new StringTokenizer(str1.replace("/", " "));
                    ar1.clear();
                    while (token.hasMoreTokens()) {
                        if (!(str2 = token.nextToken()).equals("..")) {
                            ar1.add(str2);
                        } else {
                            ar1.remove(ar1.size() - 1);
                        }
                    }
                } else {
                    StringTokenizer token = new StringTokenizer(str1.replace("/", " "));
                    while (token.hasMoreTokens()) {
                        if (!(str2 = token.nextToken()).equals("..")) {
                            ar1.add(str2);
                        } else {
                            ar1.remove(ar1.size() - 1);
                        }
                    }
                }
            } else {
                if (!ar1.isEmpty()) {
                    for (String s : ar1) {
                        System.out.print("/" + s);
                    }
                    System.out.println("/");
                } else {
                    System.out.println("/");
                }
            }
        }
    }
}