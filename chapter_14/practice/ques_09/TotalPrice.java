package chapter_14.practice.ques_09;

public class TotalPrice {
    public static void main(String[] args) {
        System.out.println("合計 " + calcTotal(4) + " 円");
    }

    public static int calcTotal(int a) {
        return 300 * a;
    }

}

/*
 * int型の引数（冊数）を1つ受け取り、1冊300円として合計金額をint型で返すメソッドcalcTotalを作る（メソッドの中では表示しない）
 * mainでcalcTotal(4)を呼んで戻り値を受け取り、「合計 （値） 円」の形で表示する
 * 実行して、合計が1200になることを確かめてください。
 */
