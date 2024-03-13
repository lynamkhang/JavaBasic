import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int mysteryNum = (int) (Math.random() * 99) + 1; //Tao so random
        Scanner input = new Scanner(System.in);
        int min = 0, max = 99;

        System.out.println("(" + min + ", " + max + ") ?");
        int Answer = input.nextInt();
        while (true) {
            if (Answer > mysteryNum) {
                System.out.println("Too large.");
                max = Answer;
            }
            else if (Answer < mysteryNum) {
                System.out.println("Too small. ");
                min = Answer;
            }
            else {
                System.out.println("Bingo");
                break;
            }
            System.out.println("(" + min + ", " + max + ") ?");
            Answer = input.nextInt();
        }
    }
}
