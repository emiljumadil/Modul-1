//package Day10;
//import java.awt.print.Book;
//import java.util.List;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//public class Exercise {
//    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);
//
//        Library library = new Library();
//
//        Books book1 = new Book("5 CM", "Donny Dhirgantoro", "ISBN-9797591514");
//        Books book2 = new Book("Ayat-ayat Cinta", "Habiburrahman El Shirazy", "ISBN 979-3604-02-6");
//        Books book3 = new Book("Buya Hamka", "A. Fuadi", "6026714731-9786026714732");
//
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//
//        System.out.println("Library System");
//        System.out.println("1. Display all books");
//        System.out.println("2. Search by title");
//        System.out.println("3. Search by author");
//        System.out.print("Select an option: ");
//        int option = scanner.nextInt();
//
//        switch (option) {
//            case 1:
//                library.displayBooks();
//                break;
//            case 2:
//                System.out.print("Enter title to search: ");
//                scanner.nextLine();
//                String searchTitle = scanner.nextLine();
//                library.searchByTitle(searchTitle);
//                break;
//            case 3:
//                System.out.print("Enter author to search: ");
//                scanner.nextLine();
//                String searchAuthor = scanner.nextLine();
//                library.searchByAuthor(searchAuthor);
//                break;
//            default:
//                System.out.println("Invalid option");
//        }
//
//        scanner.close();
//    }
//}
