import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        // implement here the program that allows the user to enter
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book newBook = new Book(title, numberOfPages, publicationYear);
            books.add(newBook);

        }
        // book information and to examine them
        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        if (information.equals("everything")) {
            for (Book info : books) {

                System.out.println(info);
            }
        } else {
            for (Book name : books) {
                System.out.println(name.getTitle());
            }
        }
    }
}
