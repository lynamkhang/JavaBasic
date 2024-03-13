import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of citizens: ");
        int N = scanner.nextInt();

        // Khởi tạo danh sách kề để biểu diễn mối quan hệ tiếp xúc giữa các công dân
        List<List<Integer>> contacts = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            contacts.add(new ArrayList<>());
        }

        // Xây dựng danh sách kề bằng cách xáo trộn mảng mã số của các công dân
        Integer[] Id = new Integer[N];
        Integer[] Contactee = new Integer[N];
        for (int i = 0; i < N; i++) {
            Id[i] = i;
            Contactee[i] = i;
        }
        Collections.shuffle(Arrays.asList(Contactee));

        // Mỗi công dân ghi mã số của một công dân mà họ đã tiếp xúc
        for (int i = 0; i < N; i++) {
            int contactee = Contactee[i];
            contacts.get(i).add(contactee);
        }


        // In ra mối quan hệ tiếp xúc của từng công dân
        System.out.print("Id        | ");
        for (int i: Id)
            System.out.print(i + "   ");

        System.out.print("\nContactee | ");
        for (int i: Contactee)
            System.out.print(i + "   ");

        // Tìm chuỗi virus bằng BFS
        System.out.println("\nThe following citizens are to be self-isolated: ");
        boolean[] infected = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0); // Bắt đầu từ công dân đầu tiên
        infected[0] = true;
        while (!queue.isEmpty()) {
            int currentCitizen = queue.poll();
            System.out.print(currentCitizen + " ");
            for (int contactee : contacts.get(currentCitizen)) {
                if (!infected[contactee]) {
                    queue.offer(contactee);
                    infected[contactee] = true;
                }
            }
        }
    }
}
