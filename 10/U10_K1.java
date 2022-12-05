public class U10_K1 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        String key = "s001";
        Educatee educatee = search(educateeList, key);
        RecordUtils.print(educatee);
    }

    public static Educatee search (EducateeList educateeList, String key) {
        for (int i = 0; i < educateeList.size(); i++) {
            Educatee educatee = educateeList.get(i);
            if (key.equals(educatee.getId())) {
                return educatee;
            }
        }
        return null;
    }
}
