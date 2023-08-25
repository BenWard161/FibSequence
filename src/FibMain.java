import java.math.BigInteger;

public class FibMain {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        fibRecursive(a, b, 100);
    }

    public static void fibRecursive(BigInteger nMinus1, BigInteger nMinus2, int sequenceLength){
        BigInteger n = nMinus1.add(nMinus2);
        System.out.println(n);
        if (sequenceLength > 1) {
            fibRecursive(n, nMinus1, sequenceLength-1);
        }
    }
}
