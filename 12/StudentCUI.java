public class StudentCUI {
    public static void main(String[] args) {
        EducateeList educateeList = RecordDB.getEducateeList();
        EducateeListManager eManager = new EducateeListManager(educateeList);

        //

        String keyId = UI.inputString("�w�Дԍ���");
        Educatee educatee = eManager.searchEducateeById(keyId);
        List<String> list = Arrays.asList("�S�Ȗ�", "�Ȗږ��ꗗ");
        int a = UI.selectList(list, "�ԍ��őI����");
        
        switch (a) {
            case 0:
                
                break;
        
            default:
                break;
        }


    }
}
