import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,total=0;
        do {
            System.out.print("Sayı Giriniz : ");
            n=scan.nextInt();
            if ((n%2==0)&&(n%4==0)){
            total+=n;
            }

        }while (n%2==0);
        System.out.println("Toplam :"+total);
    }
}