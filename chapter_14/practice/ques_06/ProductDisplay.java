package chapter_14.practice.ques_06;

public class ProductDisplay {
    public static void displayProduct(String productName, int price) {
        System.out.println(productName + " は " + price + " 円");
    }

    public static void main(String[] args) {
        displayProduct("りんご", 150);
        displayProduct("ノート", 200);
    }
}
