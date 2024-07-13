
package URI;

/**
 * @author Montaser Sbaih
 * @version 1.0
 * @email montaser.jjs@gmail.com
 * @phone +962-786258874
 * @link <a href="https://judge.beecrowd.com/en/problems/view/1156">S Sequence II</a>
 * @algorithm
 * @since 09-11-2022
 */

public class SSequenceII {

    public static void main(String[] args) {

        double sum = 0;
        for (double i = 1, j = 1; i <= 39; i += 2, j *= 2) {
            sum += i / j;
        }

        System.out.printf("%.2f\n", sum);
    }
}
