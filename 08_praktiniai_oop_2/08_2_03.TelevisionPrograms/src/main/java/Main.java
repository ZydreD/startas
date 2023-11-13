import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String name = scanner.nextLine();
        while (!name.isEmpty()) {
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());

            TelevisionProgram newProgram = new TelevisionProgram(name, duration);
            programs.add(newProgram);
            name = scanner.nextLine();
        }
        System.out.println("Program's maximum duration? ");
        int maxDuration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}
