public class Cat {
    private String name;
    public Cat (String name) {
        this.name = name; /* �|�C���g1 */
    }
    public String getName () {
        return this.name; /* �|�C���g2 */
    }
    public String talk (String s) {
        if (s.contains(this.name)) { /* �|�C���g3 */
            return "�ɂ�[";
        } else {
            return ""; /* �|�C���g4 */
        }
    }
}