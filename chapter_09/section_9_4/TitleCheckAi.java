package chapter_09.section_9_4;

import java.util.Scanner;

public class TitleCheckAi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("書名を入力してください: ");
        String title = scanner.nextLine();

        if (title.equals("旅の記録")) {
            System.out.println("その本は貸出中です");
        } else {
            System.out.println("その本は棚にあります");
        }
        scanner.close();
    }
}
