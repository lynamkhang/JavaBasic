import  java.util.Scanner;
public class Bai5 {
    public static int getStringLeghtSum(String s1, String s2) {

        return s1.length() + s2.length();
    }

    public static void getFirst3Char(String s) {
        if (s.length() < 3)
            System.out.println("Chuoi qua ngan!");
        else {
            char[] KyTu = new char[3];
            for (int i = 0; i < 3; i++) {
                KyTu[i] = s.charAt(i);
            }
            System.out.print(KyTu);
        }
    }

    public static void getLast3Char(String s) {
        if (s.length() < 3)
            System.out.println("Chuoi qua ngan!");

        else {
            char[] KyTu = new char[3];
            for (int i = 0; i < 3; i++) {
                KyTu[i] = s.charAt(s.length() - 3 + i);
            }
            System.out.print(KyTu);
        }
    }

    public static void getSixthChar(String s) {
        if (s.length() < 6)
            System.out.println("Chuoi qua ngan");
        else {
            char KyTu = s.charAt(5);
            System.out.print(KyTu);
        }
    }

    public static boolean isEqualInLenght(String s1, String s2) {
        if (s1.length() == s2.length())
            return true;
        else
            return false;
    }

    public static void findSubString(String s1, String s2) {
        int index = s1.indexOf(s2);
        if (index != -1)
            System.out.print( s2 + " xuat hien trong " + s1 + " o vi tri " + index);
        else
            System.out.println(s2 + " khong xuat trong " + s1 );
    }

    public static void main(String[] args) {
        //Nhap chuoi
        String s1, s2;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi s1: ");
        s1 = input.nextLine();
        System.out.print("Nhap chuoi s2: ");
        s2 = input.nextLine();

        //1. Cho biet tong chieu dai chuoi s1 va s2
        System.out.print("Tong chieu dai 2 chuoi la: " + getStringLeghtSum(s1, s2));

        //2. Lay 3 ky tu dau tien chuoi s1
        System.out.print("\n3 Ky tu dau cua chuoi s1: ");
        getFirst3Char(s1);

        //3. Lay 3 ky tu cuoi chuoi s2
        System.out.print("\n3 Ky tu cuoi cua chuoi s2: ");
        getLast3Char(s2);

        //4. Lay ky tu thu 6 cua chuoi s1
        System.out.print("\nKy tu thu 6 cua chuoi s1: ");
        getSixthChar((s1));

        //5. Kiem tra 2 chuoi s1 va s2 co bang nhau khong
        if (isEqualInLenght(s1, s2))
            System.out.print("\n2 chuoi bang nhau\n");
        else
            System.out.print("\n2 chuoi khong bang nhau\n");

        //6. Cho biet s2 co xuat hien trong s1 hay khong? Neu co thi do la vi tri nao
        findSubString(s1, s2);
    }
}
