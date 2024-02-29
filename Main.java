import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Judete judete = new Judete();
        try {
            judete.loadFromFile("./src/judete_in.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Scanner scanner= new Scanner(System.in);
        System.out.print("Judetul:");
        scanner.nextLine();

    }

}