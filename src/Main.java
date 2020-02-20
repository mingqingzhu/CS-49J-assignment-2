import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        int position = 0;

        System.out.println("Please choose the exercise: \n" +
                "1. Exercise 1\n" +
                "2. Exercise 2\n");
        choice = scanner.nextInt();

        if(choice == 1) {
            Exercise_1 exercise_1 = new Exercise_1();
            exercise_1.creatFrame();
        } else if(choice == 2) {
            System.out.println("Please enter the initial position for the Bug: \n");
            position = scanner.nextInt();
            BugTester bugTester = new BugTester(position);
            bugTester.test();
        } else {
            System.out.println("Please enter a valid option.\n");
        }


    }
}
