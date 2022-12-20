public class U14_1 {
    public static void main(String[] args) {
        User user = new User("s002", "Hanako");
        UserManager userManager = new UserManager(user);

        userManager.print();
    }
}
