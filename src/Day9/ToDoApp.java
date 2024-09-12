//package Day9;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class ToDoApp {
//    private static final Scanner scanner = new Scanner(System.in);
//    private static final UserManager userManager = new UserManager();
//    private static UserManagement.User currentUser = null;
//
//    public static void main(String[] args) {
//        while (true) {
//            if (currentUser == null) {
//                showMainMenu();
//            } else {
//                showUserMenu();
//            }
//        }
//    }
//
//    private static void showMainMenu() {
//        System.out.println("\nMain Menu:");
//        System.out.println("1. Register");
//        System.out.println("2. Login");
//        System.out.println("3. Exit");
//        System.out.print("Choose an option: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        switch (choice) {
//            case 1:
//                register();
//                break;
//            case 2:
//                login();
//                break;
//            case 3:
//                System.out.println("Exiting application.");
//                System.exit(0);
//                break;
//            default:
//                System.out.println("Invalid option. Please try again.");
//                break;
//        }
//    }
//
//    private static void showUserMenu() {
//        System.out.println("\nUser Menu:");
//        System.out.println("1. Add Task");
//        System.out.println("2. View Tasks");
//        System.out.println("3. Remove Task");
//        System.out.println("4. Logout");
//        System.out.print("Choose an option: ");
//        int choice = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        switch (choice) {
//            case 1:
//                addTask();
//                break;
//            case 2:
//                viewTasks();
//                break;
//            case 3:
//                removeTask();
//                break;
//            case 4:
//                currentUser = null;
//                System.out.println("Logged out successfully.");
//                break;
//            default:
//                System.out.println("Invalid option. Please try again.");
//                break;
//        }
//    }
//
//    private static void register() {
//        System.out.print("Enter username: ");
//        String username = scanner.nextLine();
//        System.out.print("Enter password: ");
//        String password = scanner.nextLine();
//
//        if (userManager.register(username, password)) {
//            System.out.println("Registration successful.");
//        } else {
//            System.out.println("Username already exists. Please try again.");
//        }
//    }
//
//    private static void login() {
//        System.out.print("Enter username: ");
//        String username = scanner.nextLine();
//        System.out.print("Enter password: ");
//        String password = scanner.nextLine();
//
//        currentUser = userManager.login(username, password);
//        if (currentUser != null) {
//            System.out.println("Login successful.");
//        } else {
//            System.out.println("Invalid username or password. Please try again.");
//        }
//    }
//
//    private static void addTask() {
//        System.out.print("Enter task description: ");
//        String task = scanner.nextLine();
//        currentUser.getTasks();
//        System.out.println("Task added successfully.");
//    }
//
//    private static void viewTasks() {
//        List<String> tasks = currentUser.getTasks();
//        if (tasks.isEmpty()) {
//            System.out.println("Your task list is empty.");
//        } else {
//            System.out.println("Your tasks:");
//            for (int i = 0; i < tasks.size(); i++) {
//                System.out.println((i + 1) + ". " + tasks.get(i));
//            }
//        }
//    }
//
//    private static void removeTask() {
//        System.out.print("Enter task number to remove: ");
//        int taskNumber = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        List<String> tasks = currentUser.getTasks();
//        if (taskNumber > 0 && taskNumber <= tasks.size()) {
//            String removedTask = tasks.get(taskNumber - 1);
//            if (currentUser.getTasks().contains(removedTask)){
//                System.out.println("Task removed successfully.");
//            } else {
//                System.out.println("Task could not be removed.");
//            }
//        } else {
//            System.out.println("Invalid task number.");
//        }
//    }
//
//    private static class UserManager {
//        public boolean register(String username, String password) {
//            return false;
//        }
//        public UserManagement.User login(String username, String password) {
//            return null;
//        }
//    }
//}
//
