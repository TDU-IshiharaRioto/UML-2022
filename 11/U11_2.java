public class U11_2 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = "s001";
        System.out.println ("search");
        Educatee educatee = eManager.searchEducateeById(keyId);
        RecordUtils.print(educatee);
    }
}