import java.util.Scanner;

//Учитывая случайное неотрицательное число, вы должны вернуть цифры этого числа в массиве в обратном порядке.
public class main {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int y = 0;
        int u=l;
        while(u!=0)
        {
            u=(u-u%10)/10;
            y++;
        }
        int[] a = new int[y];
        int p = 0;
        for(int i = 0; i<y; i++)
        {
            a[p] = l % 10;
            p++;
            l=(l-l%10)/10;
            //System.out.print(a[p]);
        }

       for (int i = 0; i < y; i++) {
           System.out.print(a[i]);
        }

    }
}
