import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadachnik_6_2 {
    public static void main(String[] args) {
//       Выведите название завтрашнего дня недели.

//        LocalDate tomorrow = LocalDate.now().plusDays(1); // получаем завтрашнюю дату
//        DayOfWeek dayOfWeek = tomorrow.getDayOfWeek(); // получаем день недели для завтрашней даты
//        System.out.println("Tomorrow is " + dayOfWeek); // выводим название завтрашнего дня
//=======================================================================================================================
//        Попросите пользователя ввести дату в формате год-месяц-день. Проверьте, ввел ли он корректное значение.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите дату в формате год-месяц-день (например, 2024-05-12):");
//        String inputDate = scanner.nextLine();
//
//        try {
//            LocalDate date = LocalDate.parse(inputDate); // Попытка преобразовать введенную строку в объект LocalDate
//            System.out.println("Вы ввели корректную дату: " + date);
//        } catch (DateTimeParseException e) {
//            System.out.println("Ошибка: Некорректный формат даты.");
//        }
//
//        scanner.close();

//        ==============================================================================================================

//        Напишите программу, которая сформирует следующую строку:
//
//        "12345 54321"

//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <=5; i++) {
//            stringBuilder.append(i);
//        }
//           stringBuilder.append(" ");
//            for(int j = 5; j > 0; j-- ) {
//                stringBuilder.append(j);
//            }
//
//        System.out.println(stringBuilder.toString());

//======================================================================================================================
//        Дан некоторый массив, например, вот такой:
//
//         {1, 2, 3, 4, 5, 6}
//         По очереди выведите в консоль подмассивы из двух элементов нашего массива:
//          {1, 2}
//          {3, 4}
//          {5, 6}

//        int[] array = {1, 2, 3, 4, 5, 6};
//
//        // Перебираем массив с шагом 2
//        for (int i = 0; i < array.length; i += 2) {
//            // Проверяем, что существует следующий элемент
//            if (i + 1 < array.length) {
//                System.out.println("{" + array[i] + ", " + array[i + 1] + "}");
//            }
//        }



    }
}


