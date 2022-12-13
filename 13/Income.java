/**
 * Income�N���X
 * ���̃N���X�́A������\���܂��B
 */
public class Income implements Item {
    private String date;
    private String name;
    private String kind;
    private int amount;

    /**
     * �R���X�g���N�^�ł��B
     * �����́A���t�A���x�̖��́A��ށA���z�ł��B
     * @param date ���t
     * @param name ���x�̖���
     * @param kind ���
     * @param amount ���z
     */
    public Income (String date, String name, String kind, int amount) {
        this.date = date;
        this.name = name;
        this.kind = kind;
        this.amount = amount;
    }

    /**
     * ���t��ԋp���܂��B
     * @return ���t
     */
    public String getDate () {
        return this.date;
    }

    /**
     * ���x�̖��̂�ԋp���܂��B
     * @return ���x�̖���
     */
    public String getName () {
        return this.name;
    }

    /**
     * ��ނ�ԋp���܂��B
     * @return ���
     */
    public String getKind () {
        return this.kind;
    }

    /**
     * ���z��ԋp���܂��B
     * @return ���z
     */
    public int getAmount () {
        return this.amount;
    }

    /**
     * �c����ԋp���܂��B�i�����̂��߁A���z��ԋp���܂��B�j
     * @return �c��
     */
    public int getRemainder () {
        return this.amount;
    }
}
