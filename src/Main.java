import java.util.Scanner;
public class Main {

    static int power(int a, int b){
        if(b!=0)
            return a*power(a,b-1);
        else
            return 1;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs Değerini Giriniz: ");
        int b = input.nextInt();
        int result = power(a,b);
        System.out.print("Sonuç: "+result);
    }
}
