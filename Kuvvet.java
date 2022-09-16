import java.util.Scanner;

public class Kuvvet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=1,n;
        System.out.print("Bir sayı giriniz : ");
        n = input.nextInt();

        System.out.println("4 ün katları");
        while (i<=n){
            i*=4;
            System.out.print(i+",");
        }
        System.out.println("");
        i = 1 ;
        System.out.println("5 in katları");
        while (i<=n){
            i*=5;
            System.out.print(i+",");
        }
    }
}
