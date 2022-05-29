import java.util.Scanner;

//Очень просто, учитывая целое число или число с плавающей запятой, найти его противоположность.
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = a*(-1);
        System.out.println(b);
    }
}
