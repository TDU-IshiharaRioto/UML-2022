public class UserManager {
    private User user;

    public UserManager (User user) {
        this.user = user;
    }

    public String getString () {
        return this.user.getId() + " " + this.user.getName();
    }

    public void print () {
        System.out.println (this.getString());
    }
}
