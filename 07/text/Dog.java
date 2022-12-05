public class Dog implements Pet {
    private String name;
    public Dog (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public String talk (String s) {
        if (s.contains(this.name)) {
            return "‚í‚ñ";
        } else {
            return "";
        }
    }
}
