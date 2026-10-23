package chapter_18.section_18_6;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi logBook = new LogBookAi("はじめてのJava");
        logBook.addRead(75);

        ShelfAi shelf = new ShelfAi();
        shelf.keep(logBook);
        shelf.latest().show();

        LogBookAi sameBook = logBook;
        sameBook.addRead(25);
        logBook.show();
    }
}
