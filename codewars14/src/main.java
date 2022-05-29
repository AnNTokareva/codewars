import java.util.Scanner;

//Мы хотим создать функцию, которая вычисляет ряд, начиная с 0 и заканчивая до заданного числа.
//
//Пример:
//Ввод:
//
//> 6
//Вывод:
//
//0+1+2+3+4+5+6 = 21
//
//Ввод:
//
//> -15
//Вывод:
//
//-15<0
//
//Ввод:
//
//> 0
//Вывод:
//
//0=0
public class main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a <= 0)
            System.out.println("0");
        int S=0;
        for(int i = a; i > 0; i--)
        {
            S = S + i;
        }
        System.out.println(S);
    }
}
