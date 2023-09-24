package homeWork7;

import java.util.LinkedList;

/**
 * Класс вьюер для вывода информации в терминал
 */
public class CalculatorView {

    private static CalculatorView instance;

    // Функция для реализации синглтон патерна
    public static CalculatorView getInstance() {
        if (instance == null) {
            return new CalculatorView();
        }
        return instance;
    }

    /**
     * Функция вывода результата в терминал
     * 
     * @param result результат вычеслений для вывода на экран
     */
    public void printResult(ComplexNumber result) {
        System.out.println("Результат: " + result.toString());
    }

    /**
     * Функция вывода ошибки в терминал
     * 
     * @param errorMessage ошибка для вывода на эран
     */
    public void printError(String errorMessage) {
        System.err.println("Ошибка: " + errorMessage);
    }

    /**
     * Функция для вывода истории вычеслений
     * 
     * @param list история вычеслений
     */
    public void printStoryLog(LinkedList<String> list) {
        System.out.println("История вычеслений ");
        for (String string : list) {
            System.err.println(string);
        }
    }

    /**
     * Функция отображения меню
     */
    public void printMenu() {
        System.out.println("1. Произвести вычесления ");
        System.out.println("2. Произвести вычесления c случайными комлексными числами ");
        System.out.println("3. Посмотреть историю вычеслений ");
        System.out.println("4. Выйти ");
    }

}