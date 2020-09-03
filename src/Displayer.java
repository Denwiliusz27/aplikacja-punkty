import java.util.List;

public class Displayer {

    public void displayMenu(List<String> lista){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dostepne opcje: ");

        for(int i=0; i<lista.size(); i++) {
            System.out.printf("%d. %s \n", i+1, lista.get(i));
        }
        System.out.println();
    }

    public void displayInputMessage(String message){
        System.out.printf("Podaj %s: ", message);
    }

    public void displayChoseNumber(MenuOption answer){
        System.out.printf("Wybrano: %d \n\n", answer.getvalue());
    }

    public void displayExitMessage(String message){
        System.out.printf("Wybrano opcje %s \n", message);
    }
}
