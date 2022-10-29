package CodeForces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link https://codeforces.com/problemset/problem/609/A
 * @since 29-10-2022
 */

class USBFlashDrivesSolution1 {//Best Solution

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int flashesN = Integer.parseInt(reader.readLine());
        int fileSize = Integer.parseInt(reader.readLine());

        int[] flashes = new int[flashesN];
        for (int i = 0; i < flashesN; i++) {
            flashes[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(flashes);

        int count = 0;
        while (fileSize > 0) {
            fileSize -= flashes[--flashesN];
            count++;
        }

        System.out.println(count);
    }
}

class USBFlashDrivesSolution2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int flashesN = Integer.parseInt(reader.readLine());
        int fileSize = Integer.parseInt(reader.readLine());

        Integer[] flashes = new Integer[flashesN];
        for (int i = 0; i < flashesN; i++) {
            flashes[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(flashes, (n1, n2) -> n2 - n1);

        int count = 0;
        while (fileSize > 0) {
            fileSize -= flashes[count++];
        }

        System.out.println(count);
    }
}
