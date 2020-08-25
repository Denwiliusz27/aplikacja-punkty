class Score {
    private String name;
    private int points;

    public Score(String name, int points){
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("%s : %d", name, points);
    }
}
