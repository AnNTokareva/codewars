public class main {
    public static double phi(double x)
    {
        return x + (19 -  x * x) / (2 * x);
    }

    public static void main(String[] args)
    {
        double[] S = new double[] {4,5};
        // начальное приближение
        double x0 = 4.5;
        double x = 0;
        System.out.println("x0 =" + x0);
        //первая итерация
        x = phi(x0);
        System.out.println("x1 =" + x);
        //считаем необходимое кол-во итераций
        double eps = 0.001;
        double q = 0.07421875;
        double M2 = 0.296875;
        int N = 0;
        while(Math.pow(q, Math.pow(2,N)) * 2 / M2 > eps)
        {
            N++;
        }
        System.out.println("Количество необходимых итераций:" + N);
        for(int i = 2;  i <= N; i++)
        {
            x = phi(x);
            System.out.println("x" + i + "=" + x);
        }
        // Определяем точность
        System.out.println("Наше решение: " + x);
        System.out.println("Точное решение: " + Math.sqrt(19));
        System.out.println("Относительная погрешность: " + (Math.sqrt(19) - x)/(Math.sqrt(19)));
    }

}
