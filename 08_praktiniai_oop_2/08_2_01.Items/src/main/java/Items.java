
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<String> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
//            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            String item = String.valueOf(new Item(name));
            items.add(item);
//            items.add(new Items(name));
        }
        for (int i = 0; i <items.size() ; i++) {
            System.out.println(items.get(i));

        }

    }
}