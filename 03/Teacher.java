public class Teacher {
    private String id;
    private String name;
    private Laboratory laboratory;
    public Teacher (String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId () {
        return this.id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getName () {
        return this.name;
    }
    public void setLaboratory (Laboratory laboratory) {
        this.laboratory = laboratory;
    }
    public Laboratory getLaboratory () {
        return this.laboratory;
    }
}
