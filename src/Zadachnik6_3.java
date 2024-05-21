import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Zadachnik6_3 {
    public static void main(String[] args) {
////        Попросите пользователя ввести два числа целых числа через консоль. Заполните массив целыми числами от минимального введенного числа до максимального.
//        Scanner scanner = new Scanner(System.in);
//
//        // Запрос у пользователя ввода первого числа
//        System.out.print("Введите любое первое целое число: ");
//        int num1 = scanner.nextInt();
//
//        // Запрос у пользователя ввода второго числа
//        System.out.print("Введите любое второе целое число: ");
//        int num2 = scanner.nextInt();
//
//        // Определение большего и меньшего числа
//        int max, min;
//
//        // Определение большего и меньшего числа
////        int max = Math.max(num1, num2);
////        int min = Math.min(num1, num2);
//
//        if (num1 > num2) {
//            max = num1;
//            min = num2;
//        } else {
//            max = num2;
//            min = num1;
//        }
//
//        // Создание массива размером (max - min + 1)
//        int[] arr = new int[max - min + 1];
//
//        // Заполнение массива числами от min до max
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = min + i;
//        }
//
//        // Вывод элементов массива
//        System.out.println("Массив чисел от " + min + " до " + max + ":");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }

//        Попросите пользователя ввести дату в формате год-месяц-день. Определите день недели, соответствующий этой дате.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите дату в формате год-месяц-день (например, 2024-05-12):");
//        String inputDate = scanner.nextLine();
//
//        try {
//            LocalDate date = LocalDate.parse(inputDate); // Попытка преобразовать введенную строку в объект LocalDate
//            DayOfWeek dayOfWeek = date.getDayOfWeek(); // получаем день недели для завтрашней даты
//            System.out.println("Tomorrow is " + dayOfWeek);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка: Некорректный формат даты.");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите год: ");
//        int year = scanner.nextInt();
//
//        boolean isLeapYear = isLeapYear(year);
//
//        if (isLeapYear) {
//            System.out.println(year + " год является високосным.");
//        } else {
//            System.out.println(year + " год не является високосным.");
//        }
//
//        scanner.close();
//    }
//
//    public static boolean isLeapYear(int year) {
//        // Год является високосным, если он кратен 4 и (не кратен 100 или кратен 400)
//        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
//

//    Дан некоторый массив, например, вот такой:
//
//    {1, 2, 3, 4, 5, 6}
//    Поменяйте местами пары элементов этого массива:
//
//     {2, 1, 4, 3, 6, 5}


//        int[] arr = {1, 2, 3, 4, 5, 6};
//
//        // Перебираем массив с шагом 2
//        for (int i = 0; i < arr.length - 1; i += 2) {
//            // Меняем местами элементы arr[i] и arr[i + 1]
//            int temp = arr[i];
//            arr[i] = arr[i + 1];
//            arr[i + 1] = temp;
//        }
//
//        // Выводим измененный массив
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }





    }
}

