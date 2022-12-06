public class U12_2 {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("äwê–î‘çÜÅÑ");
        Educatee educatee = eManager.searchEducateeById(keyId);
        System.out.println (educatee.getName() + "Ç≈Ç∑");
    }
}
