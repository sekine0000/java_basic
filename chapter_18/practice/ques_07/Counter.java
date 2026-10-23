package chapter_18.practice.ques_07;

public class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void showCount() {
        System.out.println(count);
    }
}
