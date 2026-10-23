package chapter_18.section_18_5;

public class RunnerAi {
    public static void main(String[] args) {
        LogBookAi.showTotal();

        LogBookAi firstBook = new LogBookAi("はじめてのJava");
        LogBookAi secondBook = new LogBookAi("やさしいSQL");

        LogBookAi.showTotal();
        firstBook.show();
        secondBook.show();
    }
}
