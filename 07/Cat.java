public class Cat implements Pet {
    private String name;
    public Cat (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public String talk (String s) {
        if (s.contains(this.name)) {
            return "�ɂ�[";
        } else {
            return "";
        }
    }
}
