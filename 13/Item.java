/**
 * Itemインターフェース
 * このインターフェースは、収入あるいは支出のどちらかを指すときに使用します。
 */
public interface Item {
    /**
     * 日付を返却します。
     * @return 日付
     */
    public String getDate();

    /**
     * 収支の名称を返却します。
     * @return 収支の名称
     */
    public String getName();

    /**
     * 種類を返却します。
     * @return 種類
     */
    public String getKind();

    /**
     * 金額を返却します。
     * @return 金額
     */
    public int getAmount();

    /**
     * 残高を返却します。
     * @return 残高
     */
    public int getRemainder();
}
