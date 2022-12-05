public class Cat {
    private String name;
    public Cat (String name) {
        this.name = name; /* ポイント1 */
    }
    public String getName () {
        return this.name; /* ポイント2 */
    }
    public String talk (String s) {
        if (s.contains(this.name)) { /* ポイント3 */
            return "にゃー";
        } else {
            return ""; /* ポイント4 */
        }
    }
}