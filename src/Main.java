import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //   ==============================================================================================================

//        Попросите у пользователя ввести через консоль 10 чисел. Заполните массив этими числами.

//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int[] arrInt = new int[10];
//
//        while (count < 10) {
//            System.out.println("Веедите десять любых чисел ");
//            for (int i = 0; i < arrInt.length; i++) {
//                int num2 = scanner.nextInt();
//                arrInt[i] = num2;
//                count++;
//            }
//            System.out.println(count);
//            System.out.println(Arrays.toString(arrInt));

//        ====================================================================================================================

        // Дан массив:
        //
        //int[][] arr = {
        //	{1, 2, 3},
        //	{4, 5, 6},
        //	{7, 8, 9},
        //};
        //Найдите сумму элементов этого массива.

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int count = 0;
//
//        for (int  i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++)
//             count += arr[i][j];
//        }
//
//        System.out.println(count);
//        ================================================================================================================
//        Дан массив с целыми числами:
//       int[] arr = {100, 200, 300, 400, 500};
//       Выведите в консоль элементы этого массива, первая цифра которых равна 1 или 2.
//
//        int[] arr = {100, 200, 300, 400, 500};
//        for (Integer s : arr) {
//            int temp = s;
//            while (temp > 0) {
//                int digit = temp % 10;
//                if (digit == 1 || digit == 2) {
//                    System.out.println(s);
//                    break;
//                }
//                temp = temp / 10;
//            }
//        }
//    }
//}
//    Второй способ
//        int[] arr = {100, 200, 300, 400, 500};
//
//        for (int num : arr) {
//            int firstDigit = String.valueOf(num).charAt(0) - '0'; // Получаем первую цифру числа
//            if (firstDigit == 1 || firstDigit == 2) {
//                System.out.println(num);
//            }
//        }
//    }
//}
// ========================================================================================================================
//        Дан массив с целыми числами:
//        int arr = [123, 987, 345, 567];
//        Получите второй элемент, содержащий в себе цифру 3:
//        345

//        int[] arr = {123, 987, 345, 567};
//        for (int i = 0; i < arr.length; i++) {
//            int temp = arr[i];
//            while (temp > 0) {
//                int digit = temp % 10;
//                if ((digit == 3) && (i > 1) && (i < 3)) {
//                    System.out.println(arr[i]);
//                    break;
//                }
//                temp = temp / 10;
//            }
//        }
        // =================================================================================================================
//        Напишите программу, которая выведет в консоль следующую пирамидку:
//          1
//          22
//          333
//          4444
//          55555

//        int rows = 5; // Количество строк в пирамидке
//
//        for (int i = 1; i <= rows; ++i) {
//            for (int j = 1; j <= i; ++j) {
//                System.out.print(i); // Выводим текущее значение строки i раз
//            }
//            System.out.println(); // Переходим на следующую строку
//        }
//        ==================================================================================================================

//        Попросите у пользователя ввести через консоль 10 чисел. В ответ выведите сумму этих чисел.

          Scanner scaner = new Scanner(System.in);
           int count = 0;
        System.out.println("Введите поочередно 10 чисел");

         for (int i = 0; i < 10; i++){
            int num = scaner.nextInt();
             count+=num;
        }
        System.out.println("Сумма чиссел " + count);


        System.out.println();





    }
}





































