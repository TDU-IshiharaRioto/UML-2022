/**
 * CashbookManagerクラス
 * このクラスはCashbookを管理します
 */
public class CashbookManager {
    private Cashbook cashbook;

    /**
     * コンストラクタです。
     * @param cashbook 家計簿（Cashbook）
     */
    public CashbookManager (Cashbook cashbook) {
        this.cashbook = cashbook;
    }

    /**
     * 家計簿の名前を返却します
     * @return 家計簿の名前
     */
    public String getName () {
        return this.cashbook.getName();
    }

    /**
     * 家計簿に入っている収支情報の件数を返却します。
     * @return 家計簿に入っている収支情報の件数
     */
    public int size () {
        return this.cashbook.size();
    }

    /**
     * 指定された範囲の収支情報から残高を計算し、返却します。
     * 計算の範囲は引数（size）で指定します。
     * 0からsize-1までの収支情報から残高を計算します。
     * 残高は、収入の場合には加算し、支出の場合には減算します。
     * また、{@link Item#getRemainder()}を利用します。
     * @param size 計算の範囲
     * @return 残高
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
     * 全ての収支情報から残高を計算し、返却します。
     * @return 残高
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
     * 全ての収支情報と残高を表示します。
     * 表示形式は、「日付　収支の名称　種類　金額　残高」です
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
     * 引数で指定された収支の名称を検索し、Cashbookを作成し、返却します。
     * @param name 検索したい収支の名称
     * @return 作成されたCashbook
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
     * 全ての収支情報を表示します。
     * 表示形式は、「日付　収支の名称　種類　金額」です。
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
     * 全ての収支情報から金額の合計を計算し、返却します。
     * @return 全ての収支情報の金額の合計
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
