import java.util.Scanner;

public class InputTaker {
    private Scanner scanner;

    public InputTaker(){
        scanner = new Scanner(System.in);
    }

    public int getIntValue(){
        return scanner.nextInt();
    }

    public MenuOption getOptionByInt(){
        int inputInt = scanner.nextInt();

        for (MenuOption option: MenuOption.values()) {
            if(inputInt == option.getvalue()){
                return option;
            }
        }

        return MenuOption.ERROR;
    }

    public String getStringValue(){
        return scanner.next();
    }
}
