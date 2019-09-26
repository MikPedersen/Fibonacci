import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        //udregninger der ganger input number med j
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for calculation");
        int number = input.nextInt();
        int resultat = 1;
        for (int j = 1; j <= number; j++) {
            resultat = resultat * j;
            System.out.println(resultat);
        }
    }


}
