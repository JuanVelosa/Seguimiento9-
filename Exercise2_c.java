import java.util.Scanner;

public class Exercise2_c {
    public static void main(String Args[]) {
        Scanner scanner = new Scanner(System.in);
        int numberOfProblems = scanner.nextInt();
        int minArrive = scanner.nextInt();
        int totalMin = 240 - minArrive;
        int exerciseTime = 0;
        boolean exit = false;
        int counter = 0;
        for (int j = 1; j < numberOfProblems && !exit; j++) {
            exerciseTime = j * 5;
            counter = j;
            totalMin = totalMin - exerciseTime;
            if (totalMin < exerciseTime) {
                exit = true;

            }
        }

        if (exit == true) {

            System.out.println(counter);
        } else {

            System.out.println(counter + 1);

        }

    }
}