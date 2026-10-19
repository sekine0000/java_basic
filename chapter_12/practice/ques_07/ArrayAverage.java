package chapter_12.practice.ques_07;

public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = { 12, 25, 38, 41, 54 };
        int total = 0;

        for (int index = 0; index < numbers.length; index++) {
            total += numbers[index];
        }

        double average = (double) total / numbers.length;
        System.out.println("平均: " + average);
    }
}
