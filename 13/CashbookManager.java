/**
 * CashbookManager�N���X
 * ���̃N���X��Cashbook���Ǘ����܂�
 */
public class CashbookManager {
    private Cashbook cashbook;

    /**
     * �R���X�g���N�^�ł��B
     * @param cashbook �ƌv��iCashbook�j
     */
    public CashbookManager (Cashbook cashbook) {
        this.cashbook = cashbook;
    }

    /**
     * �ƌv��̖��O��ԋp���܂�
     * @return �ƌv��̖��O
     */
    public String getName () {
        return this.cashbook.getName();
    }

    /**
     * �ƌv��ɓ����Ă�����x���̌�����ԋp���܂��B
     * @return �ƌv��ɓ����Ă�����x���̌���
     */
    public int size () {
        return this.cashbook.size();
    }

    /**
     * �w�肳�ꂽ�͈͂̎��x��񂩂�c�����v�Z���A�ԋp���܂��B
     * �v�Z�͈͈̔͂����isize�j�Ŏw�肵�܂��B
     * 0����size-1�܂ł̎��x��񂩂�c�����v�Z���܂��B
     * �c���́A�����̏ꍇ�ɂ͉��Z���A�x�o�̏ꍇ�ɂ͌��Z���܂��B
     * �܂��A{@link Item#getRemainder()}�𗘗p���܂��B
     * @param size �v�Z�͈̔�
     * @return �c��
     */
    public int getRemainder1 (int size) {
        int result = 0;
        for (int i = 0; i < size; i++) {
            Item item = this.cashbook.get(i);
            result = result + item.getRemainder();
        }
        return result;
    }

    /**
     * �S�Ă̎��x��񂩂�c�����v�Z���A�ԋp���܂��B
     * @return �c��
     */
    public int getRemainder2 () {
        int result = 0;
        for (int i = 0; i < this.cashbook.size(); i++) {
            Item item = this.cashbook.get(i);
            result = result + item.getRemainder();
        }
        return result;
    }

    /**
     * �S�Ă̎��x���Ǝc����\�����܂��B
     * �\���`���́A�u���t�@���x�̖��́@��ށ@���z�@�c���v�ł�
     */
    public void print () {
        for (int i = 0; i < this.cashbook.size(); i++) {
            Item item = this.cashbook.get(i);
            String date = item.getDate();
            String name = item.getName();
            String kind = item.getKind();
            int amount = item.getAmount();
            int remainder = this.getRemainder1(i + 1);
            System.out.println (date + " " + name + " " + kind + " " + amount + " " + remainder);
        }
    }

    /**
     * �����Ŏw�肳�ꂽ���x�̖��̂��������ACashbook���쐬���A�ԋp���܂��B
     * @param name �������������x�̖���
     * @return �쐬���ꂽCashbook
     */
    public Cashbook searchItemName (String name) {
        Cashbook cashbook2 = new Cashbook();
        int size = this.cashbook.size();
        for (int i = 0; i < size; i++) {
            Item item = this.cashbook.get(i);
            String name2 = item.getName();
            if (name2.equals(name)) {
                cashbook2.add(item);
            }
        }
        return cashbook2;
    }

    /**
     * �S�Ă̎��x����\�����܂��B
     * �\���`���́A�u���t�@���x�̖��́@��ށ@���z�v�ł��B
     */
    public void print2 () {
        for (int i = 0; i < this.cashbook.size(); i++) {
            Item item = this.cashbook.get(i);
            String date = item.getDate();
            String name = item.getName();
            String kind = item.getKind();
            int amount = item.getAmount();
            System.out.println (date + " " + name + " " + kind + " " + amount);
        }
    }

    /**
     * �S�Ă̎��x��񂩂���z�̍��v���v�Z���A�ԋp���܂��B
     * @return �S�Ă̎��x���̋��z�̍��v
     */
    public int getSum () {
        int result = 0;
        for (int i = 0; i < this.cashbook.size(); i++) {
            Item item = this.cashbook.get(i);
            result = result + item.getAmount();
        }
        return result;
    }
}
