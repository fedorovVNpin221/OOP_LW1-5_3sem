package LW3;

import java.util.Scanner;

class Stack {
    private char[] stack;
    private int top;
    private int maxSize;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new char[maxSize];
        this.top = -1;
    }

    public void push(char c) {
        if (top < maxSize - 1) {
            stack[++top] = c;
        } else {
            System.out.println("Стек переполнен");
        }
    }

    public char pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Стек пуст");
            return '0'; // Возвращаем нулевой символ, если стек пуст
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите последовательность символов: ");
        String input = scanner.nextLine();

        Stack stack = new Stack(input.length());

        // Заполняем стек символами из входной строки
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        System.out.print("Обратный порядок: ");
        // Извлекаем символы из стека и выводим их в обратном порядке
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        scanner.close();
    }
}