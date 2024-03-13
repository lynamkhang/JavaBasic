import java.util.Scanner;
import java.lang.Math;
public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Nhap canh AB: ");
        a = input.nextInt();
        System.out.print("Nhap canh AC: ");
        b = input.nextInt();
        System.out.print("Nhap canh BC: ");
        c = input.nextInt();
        int p = a + b + c;
        float n = (float)p/2;
        float h = (float)(2 * (Math.sqrt(n * (n - a) * (n - b) * (n - c))/ a ));
        float s = (float)(0.5 * h * c);
        System.out.println("Chu vi = " + p);
        System.out.println("Dien tich = " + s);
    }
}
