public enum MenuOption {
    ADD_SCORE(1),
    PRINT_SCORE(2),
    EXIT(3),
    ERROR;

    int value;

    MenuOption(){
        value = -1;
    }

    MenuOption(int value){
        this.value = value;
    }

    public int getvalue() {
        return value;
    }
}