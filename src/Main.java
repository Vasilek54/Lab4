import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть слово або фразу для перевірки на паліндром. Введіть 'exit' для виходу.");

        while (true) {
            System.out.print("Введіть слово: ");
            String input = scanner.nextLine();

            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Завершення програми. Дякуємо!");
                break;
            }

            if (PalindromeChecker.isPalindrome(input)) {
                System.out.println("'" + input + "' є паліндромом.");
            } else {
                System.out.println("'" + input + "' не є паліндромом.");
            }
        }

        scanner.close();
    }
}