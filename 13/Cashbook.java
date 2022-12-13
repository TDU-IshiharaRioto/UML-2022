import java.util.ArrayList;
import java.util.List;

/**
 * Cashbookクラス
 * このクラスは、家計簿を表します。
 */
public class Cashbook {
    private String name;
    private List<Item> list = new ArrayList<Item>();
    
    /**
     * コンストラクタです。
     */
    public Cashbook () {
    }

    /**
     * 名称をセットします。
     * @param name 名称
     */
    public void setName (String name) {
        this.name = name;
    }

    /**
     * 名称を返却します。
     * @return 名称
     */
    public String getName () {
        return this.name;
    }

    /**
     * 収支情報を追加します。
     * @param item 収支情報
     */
    public void add (Item item) {
        this.list.add(item);
    }

    /**
     * 引数で指定された収支情報を返却します。
     * @param index 追加した収支情報の順番
     * @return 指定された収支情報
     */
    public Item get (int index) {
        return this.list.get(index);
    }

    /**
     * 収支情報の件数を返却します。
     * @return 収支情報の件数
     */
    public int size () {
        return this.list.size();
    }

    /**
     * 引数で指定された収支情報を削除し、返却します。
     * @param index 追加した収支情報の順番
     * @return 削除された収支情報
     */
    public Item remove (int index) {
        return this.list.remove(index);
    }
}
