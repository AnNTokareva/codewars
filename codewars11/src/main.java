import java.util.Scanner;

//Подсчитайте количество делителей положительного целого nчисла.
//
//Случайные тесты идут до n = 500000.
//
//Примеры (ввод --> вывод)
//4 --> 3 (1, 2, 4)
//5 --> 2 (1, 5)
//12 --> 6 (1, 2, 3, 4, 6, 12)
//30 --> 8 (1, 2, 3, 5, 6, 10, 15, 30)
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int j=0;
        for(int i = a; i>0; i--)
        {
            double M = (double)a%i;
            if(M==0)
            {
                j++;
                System.out.print(i+", ");
            }
            M=0;
        }
        System.out.println();
        System.out.println("Количество делителей:");
        System.out.println(j);
    }
}
