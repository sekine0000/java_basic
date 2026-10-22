package chapter_15.practice.ques_07.app;

import chapter_15.practice.ques_07.logic.LargerNumber;

public class PageViewer {
    public static void main(String[] args) {
        int larger = LargerNumber.getLarger(320, 180);
        System.out.println("大きいほうは " + larger + " ページ");
    }
}
