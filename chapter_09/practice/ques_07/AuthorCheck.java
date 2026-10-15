package chapter_09.practice.ques_07;

class AuthorCheck {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("著者名を入力してください: ");
        String authorName = scanner.nextLine();

        if (authorName.equals("夏目漱石")) {
            System.out.println("一致します");
        } else {
            System.out.println("一致しません");

            scanner.close();
        }
    }
}
