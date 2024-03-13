import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap A[" + i + "]: ");
            A[i] = input.nextInt();
        }

        //1. Tao mang so nguyen B voi gia tri ngau nhien
        System.out.println("Nhap m: ");
        int m = input.nextInt();
        int B[] = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = (int) (Math.random() *  99) + 1; //gia ngau nhien tu 1 - 100
        }

        //2. Xuat toan bo cac phan tu cua B ra man hinh
        System.out.println("Mang B: " + Arrays.toString(B));

        //3. Tao mang C tu mang A
        int C[] = Arrays.copyOf(A, n);

        //4. Thay the phan tu thu 1 den 3 cua mang C bang 3 phan tu cua cua mang B
        System.arraycopy(B, B.length - 3, C,0,3);

        //5. Sap xep mang C tang dan va suat ra man hinh
        Arrays.sort(C);
        System.out.println("Mang C " + Arrays.toString(C));
    }
}
