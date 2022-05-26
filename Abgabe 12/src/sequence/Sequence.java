package sequence;

import java.math.BigDecimal;
import java.math.MathContext;
import static java.math.RoundingMode.HALF_UP;

public class Sequence {
    BigDecimal lustig(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a nonnegative integer value");
        }
        MathContext mathContext = new MathContext(300, HALF_UP);
        BigDecimal sumSeq = new BigDecimal(0, mathContext);
        BigDecimal summand = new BigDecimal(0, mathContext);
        BigDecimal two = new BigDecimal(2);
        for (int i = 0; i <= n; i++) {
            BigDecimal m = new BigDecimal(i);
            summand = m.add(BigDecimal.ONE).pow(i).divide(two.pow(i), mathContext);
            sumSeq = sumSeq.add(summand, mathContext);
        }
        return sumSeq;
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        System.out.println(sequence.lustig(100));
    }
}
