package chapter_18.practice.ques_08;

public class Runner {
    public static void main(String[] args) {
        Bookmark bookmark = new Bookmark("はじめてのJava", 42);
        System.out.println(bookmark.title + " : " + bookmark.page + "ページ目にしおりを挟んだ");
    }
}

// Runnerのmainから、Bookmarkをnew Bookmark("はじめてのJava",
// 42)で1つ作り、「（title）：（page）ページ目にしおりを挟んだ」の形で1行表示する
