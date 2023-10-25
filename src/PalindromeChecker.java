public class PalindromeChecker {
    public static boolean isPalindrome(String word) {
        // Перетворення слова в нижній регістр
        String lowerCaseWord = word.toLowerCase();

        // Видалення пробілів
        String withoutSpaces = lowerCaseWord.replaceAll(" ", "");

        // Перевірка на паліндром
        String reversed = new StringBuilder(withoutSpaces).reverse().toString();
        return withoutSpaces.equals(reversed);
    }
}
