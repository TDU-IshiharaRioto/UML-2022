public class StudentCUI {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("ŠwĞ”Ô†„");
        Educatee educatee = eManager.searchEducateeById(keyId);
        List<String> list = Arrays.asList("‘S‰È–Ú", "‰È–Ú–¼ˆê——");
        int a = UI.selectList(list, "”Ô†‚Å‘I‘ğ„");
        
        switch (a) {
            case 0:
                
                break;
        
            default:
                break;
        }


    }
}
