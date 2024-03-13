import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Calendar a, b;
        int yA, mA, dA, yB, mB, dB;

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap nam cua ngay a: ");
        yA = input.nextInt();
        System.out.print("Nhap thang cua ngay a: ");
        do {
            mA = input.nextInt();
            if (mA > 12 || mA < 0)
                System.out.print("Thang khong hop le! Vui long nhap lai: ");
        } while (mA > 12 || mA < 0);
        System.out.print("Nhap ngay cua ngay a: ");
        dA = input.nextInt();
        System.out.print("Nhap nam cua ngay b: ");
        yB = input.nextInt();
        System.out.print("Nhap thang cua ngay b: ");
        do {
            mB = input.nextInt();
            if (mB > 12 || mB < 0)
                System.out.print("Thang khong hop le! Vui long nhap lai: ");
        } while (mB > 12 || mB < 0);
        System.out.print("Nhap ngay cua ngay b: ");
        dB = input.nextInt();

        a = new GregorianCalendar(yA, mA - 1, dA);
        b = new GregorianCalendar(yB, mB - 1, dB);

        //1. So sanh 2 ngay a va b
        if (a.compareTo(b) > 0) {
            System.out.println("Ngay a sau ngay b");
        } else if (a.compareTo(b) < 0) {
            System.out.println("Ngay a truoc ngay b");
        } else {
            System.out.println("Ngay a bang ngay b");
        }

        //2. In ra ngay truoc va ngay tiep theo cua ngay a
        Calendar BeforeA = (Calendar) a.clone();
        BeforeA.add(Calendar.DAY_OF_MONTH, - 1);
        System.out.println("Ngay truoc ngay a la: " + BeforeA.getTime());

        Calendar AfterA = (Calendar) a.clone();
        AfterA.add(Calendar.DAY_OF_MONTH, + 1);
        System.out.println("Ngay sau ngay a la: " + AfterA.getTime());

        //3. Cho biet a la ngay thu may trong nam
        int dateOfYear = a.get(Calendar.DAY_OF_YEAR);
        System.out.println("Ngay a la ngay thu " + dateOfYear + " trong nam");

        //4. Cho biet thang chua a co bao nhieu
        int dateInMonth = a.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Thang cua a co " + dateInMonth + " ngay");

        //5. Cho biet nam chua a co phai la nam nhuan hay khong
        Calendar temp = new GregorianCalendar();
        int Year = a.get(Calendar.YEAR);
        int Month = Calendar.FEBRUARY;
        temp.set(Calendar.YEAR, Year);
        temp.set(Calendar.MONTH, Month);
        if (temp.getActualMaximum(Calendar.DAY_OF_MONTH) == 29)
            System.out.println("Nam chua a la nam nhuan");
        else
            System.out.println("Nam chua a khong la nam nhuan");
    }
}
