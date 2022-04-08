import java.util.Scanner;

public class Exercise2_b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int f = scanner.nextInt();
        for (int j = 0; j < f; j++) {
            long p = scanner.nextLong();
            long l = scanner.nextLong();
            long mid = (p / 2) + 1;
            long answer = l / mid;
            System.out.println(answer);
        }
    }
}