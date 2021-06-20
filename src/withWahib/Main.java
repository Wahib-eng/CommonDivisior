package withWahib;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // أدخل رقمين صحيحين
        System.out.print("" +
                "ادخل الرقم الاول : ");
        int n1 = input.nextInt();
        System.out.print("أدخل الرقم الثاني :  ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }

        System.out.println("القاسم المشترك الأكبر لـ " + n1 +
                " و " + n2 + " هو " + gcd);
    }
}
