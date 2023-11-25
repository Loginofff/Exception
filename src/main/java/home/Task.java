package home;

import java.util.Scanner;

public class Task {


  public static void main(String[] args) {

// Запросить значение n у пользователя.
    // Вызвать метод и передать туда значение, полученное от пользователя.
    // Посмотреть, какие ошибки возможны в данном коде и для каждой
    // ошибки создать пользовательское исключение.
    // Выбросить эти исключения в нужное время и обработать их в main.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число:");
    int n = scanner.nextInt();
    try {
      testingExceptions(n);
    } catch (DivisionByZeroException | ArrayOutOfBoundsException |
             NegativeArraySize e) {
      System.out.println("Ошибка! - " + e.getMessage());
    }
    System.out.println("Успешное завершение работы программы.");
  }

  public static void testingExceptions(int n) throws DivisionByZeroException, ArrayOutOfBoundsException, NegativeArraySizeException {
    if (n == 0) {
      throw new DivisionByZeroException("Не делится на 0");
    }
    int x = 10 / n;
    System.out.println(x);
    if (n < 0) {
      throw new NegativeArraySizeException("Не может быть меньше 0! ");
    }
    int[] array = new int[n];
    if (n >= array.length) {
      throw new ArrayOutOfBoundsException("Выход за пределы массива!");
    }
    System.out.println(array.length);
    System.out.println(array[n]);
  }
}




