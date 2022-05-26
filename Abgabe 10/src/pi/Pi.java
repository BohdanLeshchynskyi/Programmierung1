package pi;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Pi {
    public static void main(String[] args) {
        Pi pi = new Pi();
        BigDecimal p = pi.approximatePi(25, 100);
        System.out.println(p);
    }

    BigDecimal approximatePi(int precision, int iterations) {
        MathContext mathContext = new MathContext(precision, RoundingMode.HALF_UP);
        BigDecimal p = new BigDecimal(0);
        BigDecimal iterationResult;
        BigDecimal sixteen = new BigDecimal(16);
        BigDecimal two = new BigDecimal(2);
        BigDecimal four = new BigDecimal(4);
        BigDecimal five = new BigDecimal(5);
        BigDecimal eight = new BigDecimal(8);
        BigDecimal six = new BigDecimal(6);
        for (int n = 0; n <= iterations; n++) {
            BigDecimal m = new BigDecimal(n);
            BigDecimal firstSummand = four.divide(eight.multiply(m).add(BigDecimal.ONE), mathContext);
            BigDecimal secondSummand = two.divide(eight.multiply(m).add(four, mathContext), mathContext);
            BigDecimal thirdSummand = BigDecimal.ONE.divide(eight.multiply(m).add(five), mathContext);
            BigDecimal forthSummand = BigDecimal.ONE.divide(eight.multiply(m).add(six), mathContext);
            BigDecimal iterationStep = firstSummand.subtract(secondSummand, mathContext);
            iterationStep = iterationStep.subtract(thirdSummand, mathContext);
            iterationStep = iterationStep.subtract(forthSummand, mathContext);
            iterationStep = BigDecimal.ONE.divide(sixteen.pow(n), mathContext).multiply(iterationStep, mathContext);
            iterationResult = p.add(iterationStep, mathContext);
            p = iterationResult;
        }
        return p;
    }
}
