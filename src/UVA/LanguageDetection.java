package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LanguageDetection {

    private static Map<String, String> map = new HashMap<>();

    static {
        map.put("HELLO", "ENGLISH");
        map.put("HOLA", "SPANISH");
        map.put("HALLO", "GERMAN");
        map.put("BONJOUR", "FRENCH");
        map.put("CIAO", "ITALIAN");
        map.put("ZDRAVSTVUJTE", "RUSSIAN");
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int tc = 1;
        String line;
        while (!(line = reader.readLine()).equals("#")) {
            System.out.printf("Case %d: %s\n", tc++, map.getOrDefault(line, "UNKNOWN"));
        }
    }
}