package chapter_14.section_14_2;

public class RecorderAi {
    public static void printHeading() {
        System.out.println("読書の記録");
        System.out.println("==========");
    }

    public static void printBook(String title, int pages) {
        System.out.println(title + " は " + pages + " ページ");
    }

    public static void main(String[] args) {
        printHeading();
        printBook("旅の記録", 320);
        printBook("星の地図", 180);
    }
}
