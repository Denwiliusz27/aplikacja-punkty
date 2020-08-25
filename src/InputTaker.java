import java.util.Scanner;

public class InputTaker {
    private Scanner scanner;

    public InputTaker(){
        scanner = new Scanner(System.in);
    }

    public int getIntValue(){
        return scanner.nextInt();
    }

    public String getStringValue(){
        return scanner.next();
    }
}
