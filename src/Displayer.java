import java.util.List;

public class Displayer {

    public void displayMenu(List<String> lista){

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Dostepne opcje: ");

        for(int i=0; i<lista.size(); i++) {
            System.out.printf("%d. %s \n", i+1, lista.get(i));
        }
    }
}
