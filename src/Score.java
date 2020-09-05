/**
 * Klasa reprezentująca wyniki: osoby i zdobytą przez nie ilość punktów.
 */
class Score {
    private String name;
    private int points;

    /**
     * Służy do stworzenia wyniku: zainicjowania pola name imieniem oraz pola points - zdobytą ilością punktów
     *
     * @param name imie osoby
     * @param points zdobyta ilosc punktow przez osobe
     */
    public Score(String name, int points){
        this.name = name;
        this.points = points;
    }

    /**
     * Metoda wypisuje wynik: imie osoby oraz zdobytą przez nią ilość punktów.
     *
     * Metoda wykorzystuje {@link String#format(String, Object...)}aby wyświetlić dane. Imie osoby oraz ilość puntów
     * zostają przekonwertowane na ciąg znaków i w wstawione w określonych miejscach, a następnie wypisane na ekranie,
     * oddzielone dwukropkiem
     */
    @Override
    public String toString() {
        return String.format("%s : %d", name, points);
    }
}