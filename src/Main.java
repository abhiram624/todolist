import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskOperations obj =
                new TaskOperations();

        while (true) {

            System.out.println();

            System.out.println("===== TO DO LIST =====");

            System.out.println("1. Add Task");

            System.out.println("2. View Tasks");

            System.out.println("3. Update Task");

            System.out.println("4. Delete Task");

            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:
                    obj.addTask();
                    break;

                case 2:
                    obj.viewTasks();
                    break;

                case 3:
                    obj.updateTask();
                    break;

                case 4:
                    obj.deleteTask();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

            }

        }

    }

}