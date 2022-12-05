public class Test implements Record {
    private String name;
    private int score = 0;
    public Test (String name) {
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
}
