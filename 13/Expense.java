/**
 * Expense�N���X
 * ���̃N���X�͎x�o��\���܂�
 */
public class Expense implements Item{
    private String date;
    private String name;
    private String kind;
    private int amount;

    /**
     * �R���X�g���N�^�ł��B
     * @param date ���t
     * @param name ���x�̖���
     * @param kind ���
     * @param amount ���z
     */
    public Expense (String date, String name, String kind, int amount) {
        this.date = date;
        this.name = name;
        this.kind = kind;
        this.amount = amount;
    }

    /**
     * ���t��ԋp���܂�
     * @return ���t
     */
    public String getDate () {
        return this.date;
    }

    /**
     * ���x�̖��̂�ԋp���܂�
     * @return ���x�̖���
     */
    public String getName () {
        return this.name;
    }

    /**
     * ��ނ�ԋp���܂�
     * @return ���
     */
    public String getKind () {
        return this.kind;
    }

    /**
     * ���z��ԋp���܂�
     * @return ���z
     */
    public int getAmount () {
        return this.amount;
    }

    /**
     * �c����ԋp���܂��B�i�x�o�̂��߁A�[�i�}�C�i�X�j�̋��z��ԋp���܂��j
     * @return �c��
     */
    public int getRemainder () {
        return this.amount * -1;
    }
}
