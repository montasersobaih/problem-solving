package URI;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1155">S Sequence</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SSequence {

    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("%.2f\n", sum);
    }
}
