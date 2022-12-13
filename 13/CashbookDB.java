public class CashbookDB {
    public static Cashbook getCashbook () {
        Cashbook cashbook = new Cashbook();
        cashbook.setName("家計簿");
        cashbook.add(new Income("1/1", "収入", "給料", 100000));
        cashbook.add(new Expense("1/2", "支出", "外食", 1500));
        cashbook.add(new Expense("1/3", "支出", "福袋", 1000));
        cashbook.add(new Expense("1/5", "支出", "家賃", 50000));
        cashbook.add(new Expense("1/7", "支出", "衣料", 5000));
        return cashbook;
    }
}
