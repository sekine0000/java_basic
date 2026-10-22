package chapter_17.section_17_4;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi javaBook = new LogBookAi();
        javaBook.title = "はじめてのJava";
        javaBook.addRead(75);

        LogBookAi sqlBook = new LogBookAi();
        sqlBook.title = "やさしいSQL";
        sqlBook.addRead(20);

        javaBook.show();
        sqlBook.show();
    }
}
