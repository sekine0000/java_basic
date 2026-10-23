package chapter_18.practice.ques_06;

public class Message {
    String text;

    public Message() {
        this("Hello");
    }

    public Message(String text) {
        this.text = text;
    }

    public void show() {
        System.out.println(this.text);
    }
}
