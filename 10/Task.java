public class Task implements Record {
    private String name;
    private int score = 0;
    private int number = 1;
    public Task (String name) {
        this.name = name;
    }
    @Override
    public String getName () {
        return this.name;
    }
    @Override
    public void setScore (int score) {
        this.score = score;
    }
    @Override
    public int getScore () {
        return this.score;
    }
    public void setNumber (int number) {
        this.number = number;
    }
    public int getNumber () {
        return this.number;
    }
}
