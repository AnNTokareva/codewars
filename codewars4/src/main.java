//Натан любит ездить на велосипеде.
//
//Поскольку Натан знает, что важно оставаться гидратированным, он выпивает 0,5 литра воды в час езды на велосипеде.
//
//Вам дается время в часах, и вам нужно вернуть количество литров, которое выпьет Натан, округленное до наименьшего значения.
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        int k;
        k = (int)l/2;
        System.out.println(k);
    }
}
