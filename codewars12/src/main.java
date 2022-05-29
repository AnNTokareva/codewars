//Учитывая список целых чисел, определите, является ли сумма его элементов нечетной или четной.
//
//Дайте свой ответ в виде строки, соответствующей "odd"или "even".

public class main {
    public static void main(String[] args)
    {
        int[] a = new int[] {0,1,3,4,5};
        int S = 0;
        double M;
        for(int i = 0; i < a.length; i++)
        {
            S = S + a[i];
        }
        M=(double)S % 2;
        if(S==0) System.out.println("Массив с нулем");
        if(M==0)
            System.out.println("even");
        else System.out.println("odd");
       // System.out.println(S);
    }
}
