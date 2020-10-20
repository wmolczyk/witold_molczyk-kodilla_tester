import java.util.Scanner;

public class Zapytanie {
    public static String getFirstLetterOfColor(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the first letter for the color of your choice (A - amber, B - blue," +
                            "C - cobalt, D - dandelion): ");
            String question = scanner.nextLine().trim().toUpperCase();
            switch (question) {
                case "A": return "AMBER";
                case "B": return "BLUE";
                case "C": return "COBALT";
                case "D": return "DANDELION";
                default:
                    System.out.println("Something went wrong - we have only 4 options available so would you please read again and pick on of those");
            }
        }
    }
}




