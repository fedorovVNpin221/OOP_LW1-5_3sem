package LW1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод текста
        System.out.print("Введите текст: ");
        String originalText = input.nextLine();

        // Ввод значения k
        System.out.print("Введите k: ");
        int k = input.nextInt();
        input.nextLine(); // Очистка буфера

        // Ввод символа для замены
        System.out.print("Укажите символ: ");
        String replacementSymbol = input.nextLine();

        // Обработка текста и вывод результата
        System.out.println(ModificatedText(originalText, k, replacementSymbol));
    }

    private static String ModificatedText(String text, int k, String symbol) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c);
            } else {
                count++;
                result.append(count % k == 0 ? symbol : c);
            }
        }

        return result.toString();
    }
}
