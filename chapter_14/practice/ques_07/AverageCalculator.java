package chapter_14.practice.ques_07;

public class AverageCalculator {
    public static double calculateAverage(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber) / 2.0;
    }

    public static void main(String[] args) {
        double average = calculateAverage(10, 20);
        System.out.println("平均は " + average + " です");
    }
}
