package chapter_14.practice.ques_10;

public class PriceOverload {
    public static void main(String[] args) {
        showPrice(500);
        showPrice(500, "セール");
    }

    public static void showPrice(int price) {
        System.out.println(price + " 円 ");
    }

    public static void showPrice(int price, String label) {
        System.out.println(price + " 円 " + label);
    }

}

/*
 * int型の引数（価格）だけを受け取るshowPriceを作り、「（価格） 円」の形で表示する
 * int型の引数（価格）とString型の引数（ラベル）を受け取る、同じ名前のshowPriceをもう1つ作り、「（価格） 円（ラベル）」の形で表示する
 * mainからshowPrice(500)とshowPrice(500, "セール")の両方を呼ぶ
 * Section 14-6 のオーバーロードと同じ形です。実行して、渡した引数の個数に応じて違うメソッドが呼ばれることを確かめてください。
 */
