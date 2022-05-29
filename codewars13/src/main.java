import java.util.Scanner;

//Реализовать функцию, которая принимает 3 целочисленных значения a, b, c.
// Функция должна возвращать true, если треугольник может быть построен со сторонами заданной длины и false в любом другом случае.
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();
        if(a < b + c && b < a + c && c < a + b)
            System.out.println("true");
        else System.out.println("false");
    }
}
