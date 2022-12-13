import java.util.ArrayList;
import java.util.List;

/**
 * Cashbook�N���X
 * ���̃N���X�́A�ƌv���\���܂��B
 */
public class Cashbook {
    private String name;
    private List<Item> list = new ArrayList<Item>();
    
    /**
     * �R���X�g���N�^�ł��B
     */
    public Cashbook () {
    }

    /**
     * ���̂��Z�b�g���܂��B
     * @param name ����
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * ���̂�ԋp���܂��B
     * @return ����
     */
    public String getName () {
        return this.name;
    }

    /**
     * ���x����ǉ����܂��B
     * @param item ���x���
     */
    public void add (Item item) {
        this.list.add(item);
    }

    /**
     * �����Ŏw�肳�ꂽ���x����ԋp���܂��B
     * @param index �ǉ��������x���̏���
     * @return �w�肳�ꂽ���x���
     */
    public Item get (int index) {
        return this.list.get(index);
    }

    /**
     * ���x���̌�����ԋp���܂��B
     * @return ���x���̌���
     */
    public int size () {
        return this.list.size();
    }

    /**
     * �����Ŏw�肳�ꂽ���x�����폜���A�ԋp���܂��B
     * @param index �ǉ��������x���̏���
     * @return �폜���ꂽ���x���
     */
    public Item remove (int index) {
        return this.list.remove(index);
    }
}
