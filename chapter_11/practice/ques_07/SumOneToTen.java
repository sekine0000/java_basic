package chapter_11.practice.ques_07;

public class SumOneToTen {
    public static void main(String[] args) {
        int sum = 0;

        for (int number = 1; number <= 10; number++) {
            sum += number;
        }

        System.out.println(sum);
    }
}
