import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int mysteryNum = (int) (Math.random() * 99) + 1; //Tao so random
        Scanner input = new Scanner(System.in);
        int answer;
        int min = 0, max = 99;

        System.out.println("(" + min + ", " + max + ") ?");
        do {
            answer = input.nextInt();
            if (answer > max || answer < min)
                System.out.println("Out of range. Try again?");
        }while (answer > max || answer < min);

        while (true) {
            if (max == min)
                System.out.println("You lost!");
            if (answer > mysteryNum) {
                System.out.println("Too large.");
                max = answer - 1;
            }
            else if (answer < mysteryNum) {
                System.out.println("Too small. ");
                min = answer + 1;
            }

            else {
                System.out.println("Bingo");
                break;
            }
            System.out.println("(" + min + ", " + max + ") ?");
            do {
                answer = input.nextInt();
                if (answer > max || answer < min) {
                    System.out.println("Out of range. Try again?");
                    System.out.println("(" + min + ", " + max + ") ?");
                }
            }while (answer > max || answer < min);
        }
    }
}
