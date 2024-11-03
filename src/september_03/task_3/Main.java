package september_03.task_3;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<String> randomStrings = IntStream.range(0, 5)
                .mapToObj(e -> generateRandomString())
                .toList();
        List<String> palindromes = randomStrings.stream()
                .map(Main::makePalindrome)
                .toList();
        randomStrings.forEach(System.out::println);
        System.out.println(palindromes);
    }

    private static String generateRandomString() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    // Метод для преобразования строки в палиндром
    private static String makePalindrome(String s) {
        return new StringBuilder(s).reverse().toString();
    }

}
