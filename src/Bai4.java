import java.util.Scanner;
import java.lang.Math;
public class Bai4 {
    //1. Liet ke cac uoc so cua n
    public static void lietKeUocSo(int n){
        System.out.print("Cac uoc so cua n: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
    //2. Cho biet n co bao nhieu chu so
    public static void demChuSo(int n) {
        int count = 0;
        while(n >= 10) {
            n /= 10;
            count++;
        }
        System.out.print("\nn co " + (count + 1) +" chu so");
    }
    //3. Kiem tra n co phai la so doi xung khong
    public static boolean laSoDoiXung(int n) {
        int r = 0;
        int o = n;
        while(n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }
        return r == o;
    }

    //4. Kiem tra n la so chinh phuong
    public static boolean laSoChinhPhuong(int n) {
        double squareRoot = Math.sqrt(n);
        return squareRoot == Math.floor(squareRoot);
    }

    public static void main(String[] args) {
        //Nhap so nguyen duong n
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n;
        do {
            n = input.nextInt();
            if (n < 0)
                System.out.print("n phai la so nguyen duong! Vui long nhap lai: ");
        } while(n < 0);
        //1. Liet ke cac uoc so cua n
        lietKeUocSo(n);
        //2. Cho biet n co bao nhieu chu so
        demChuSo(n);
        //3. Kiem tra n co phai la so doi xung khong
        if (laSoDoiXung(n))
            System.out.print("\nn la so doi xung");
        else
            System.out.print("\nn khong phai la so doi xung");
        //4. Kiem n la so chinh phuong
        if (laSoChinhPhuong(n))
            System.out.print("\nn la so chinh phuong");
        else
            System.out.print("\nn khong phai la so chinh phuong");
    }
}
