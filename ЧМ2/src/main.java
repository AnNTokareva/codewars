public class main {
    public static double F(double x)
    {
        return x * x * x + 3 * x * x - 3;
    }

    public static double phi(double x, double tau)
    {
        return x + tau * F(x);
    }

    public static void main(String[] args) {
        double[] x0 = new double[]{-3, -2, 0.5};
        double[] tau = new double[]{-0.05, 0.1, -0.02};
        double[] q = new double[]{0.8125, 0.775, 0.925};
        // начальное приближение
        double eps = 0.0001;
        double x;
        int N = 0;
        for (int i = 0; i < x0.length; i++) {
            System.out.println("Корень №" + (i + 1));
            System.out.println("x0 = " + x0[i]);
            x = phi(x0[i], tau[i]);
            System.out.println("x1 = " + x);
            N = 0;
            while (Math.pow(q[i], N) / (1 - q[i]) * Math.abs(x - x0[i]) > eps) {
                N++;
            }
            System.out.println("Количество необходимых итераций: " + N);
            for (int j = 2; j <= N; j++) {
                x = phi(x, tau[i]);
                System.out.println("x" + j + " = " + x);
            }
        }
    }
}
