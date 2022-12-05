public class U11_K1 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = "s001";
        String keySubjectName = "UMLââèK";
        System.out.println ("search");
        Subject subject = eManager.searchSubjectById(keyId, keySubjectName);
        RecordUtils.print(subject);
    }
}