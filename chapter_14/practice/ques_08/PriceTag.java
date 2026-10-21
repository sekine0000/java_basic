package chapter_14.practice.ques_08;

public class PriceTag {
    public static void displayProduct(String productName, int price) {
        System.out.println(productName + " は " + price + " 円です");
    }

    public static void main(String[] args) {
        displayProduct("ノート", 500);
        displayProduct("ペン", 150);
    }

}

// String型の引数（商品名）と、int型の引数（価格）を受け取り、「（商品名） は （価格）
// 円です」の形で1行表示するメソッドshowPriceを1つ作る（戻り値はvoid）
// mainからshowPriceを「ノート」500円、「ペン」150円の2回呼ぶ