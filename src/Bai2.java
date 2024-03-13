import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Nhap n
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        //Nhap x
        System.out.print("Nhap x: ");
        float x = input.nextFloat();
        //Tinh S(n)
        float s = 0, t = 1, m = 0;
        for (int i = 1; i <= n; i++) {
            //Tinh tu
            t = t * x;
            //Tinh mau
            m = m + i;
            //Tinh S(n)
            s = s + (float)t/m;
        }
        System.out.println("Ket qua: "+ s);
    }
}
