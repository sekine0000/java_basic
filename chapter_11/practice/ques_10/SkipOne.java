package chapter_11.practice.ques_10;

public class SkipOne {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
