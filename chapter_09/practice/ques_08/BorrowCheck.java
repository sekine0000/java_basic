package chapter_09.practice.ques_08;

public class BorrowCheck {
    public static void main(String[] args) {
        int pages = 280;
        int price = 1800;
        if (pages >= 300 && price <= 2000) {
            System.out.println("ページ数が300以上、かつ価格が2000以下です。");
        } else {
            System.out.println("ページ数が300未満、または価格が2000より上です。");
        }
    }

}
