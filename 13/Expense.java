/**
 * Expenseクラス
 * このクラスは支出を表します
 */
public class Expense implements Item{
    private String date;
    private String name;
    private String kind;
    private int amount;

    /**
     * コンストラクタです。
     * @param date 日付
     * @param name 収支の名称
     * @param kind 種類
     * @param amount 金額
     */
    public Expense (String date, String name, String kind, int amount) {
        this.date = date;
        this.name = name;
        this.kind = kind;
        this.amount = amount;
    }

    /**
     * 日付を返却します
     * @return 日付
     */
    public String getDate () {
        return this.date;
    }

    /**
     * 収支の名称を返却します
     * @return 収支の名称
     */
    public String getName () {
        return this.name;
    }

    /**
     * 種類を返却します
     * @return 種類
     */
    public String getKind () {
        return this.kind;
    }

    /**
     * 金額を返却します
     * @return 金額
     */
    public int getAmount () {
        return this.amount;
    }

    /**
     * 残高を返却します。（支出のため、ー（マイナス）の金額を返却します）
     * @return 残高
     */
    public int getRemainder () {
        return this.amount * -1;
    }
}
