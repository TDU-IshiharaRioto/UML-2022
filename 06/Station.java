public class Station {
    private String name;
    private Station down = null;
    private Station up = null;
    public Station (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setDown (Station down) {
        this.down = down;
    }
    public Station getDown () {
        return this.down;
    }
    public void setUp (Station up) {
        this.up = up;
    }
    public Station getUp () {
        return this.up;
    }
}
