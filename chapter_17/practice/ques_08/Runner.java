package chapter_17.practice.ques_08;

public class Runner {
    public static void main(String[] args) {
        Bookmark book = new Bookmark();
        book.title = "はじめてのJava";
        book.page = 42;
        System.out.println(book.title + " : " + book.page + "ページ目にしおりを挟んだ");
    }

}

/*
 * *
 * Runnerのmainから、「（title）：（page）
 * ページ目にしおりを挟んだ」の形で1行表示する
 */
