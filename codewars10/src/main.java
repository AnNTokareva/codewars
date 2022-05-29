import java.util.Scanner;

//Учитывая делитель и границу, найдите наибольшее целое число N , такое, что ,
//
//Условия :
//N делится на делитель
//
//N меньше или равно bound
//
//N больше 0.
//
//Примечания
//Параметры (делитель, граница), передаваемые функции, являются только положительными значениями.
//Гарантируется, что делитель найден .
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int max = sc1.nextInt();
        int a;
        a = max - min;
        for(int i = 1; i <= a; i++)
        {
            double M = max - i + 1;
            double m = (double)M%min;
            if(m == 0)
            {
                System.out.println((int)M);
                break;
            }
        }
    }
}
