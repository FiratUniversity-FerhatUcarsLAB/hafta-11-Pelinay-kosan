public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return 0.0;
    }

    public static double expSum(double x) {
        // TODO
        return 0.0;
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}
public class Multadd {

    // multadd(a, b, c) → a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum(x) → x * Math.exp(-x) + (1 - Math.exp(-x))
    public static double expSum(double x) {
        double expNegX = Math.exp(-x);
        // multadd kullanarak: a = x, b = exp(-x), c = (1 - exp(-x))
        return multadd(x, expNegX, 1 - expNegX);
    }

    public static void main(String[] args) {

        // 1. Basit test
        double r1 = multadd(1.0, 2.0, 3.0);
        System.out.println("multadd(1.0, 2.0, 3.0) = " + r1);

        // 2. sin(pi/4) + cos(pi/4) / 2
        double sin = Math.sin(Math.PI / 4);
        double cos = Math.cos(Math.PI / 4);

        // multadd(a, b, c) = a * b + c
        // sin(pi/4) + cos(pi/4)/2  →  multadd(cos, 0.5, sin)
        double trigExpr = multadd(cos, 0.5, sin);
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + trigExpr);

        // 3. log(10) + log(20)
        // multadd(1, log(10), log(20)) = 1 * log(10) + log(20)
        double logExpr = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log(10) + log(20) = " + logExpr);

        // 4. expSum testi
        double x = 2.0;
        double expResult = expSum(x);
        System.out.println("expSum(" + x + ") = " + expResult);
    }
}
