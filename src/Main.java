import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

//          Scanner scaner = new Scanner(System.in);
//           int count = 0;
//        System.out.println("Введите поочередно 10 чисел");
//
//         for (int i = 0; i < 10; i++){
//            int num = scaner.nextInt();
//             count+=num;
//        }
//        System.out.println("Сумма чиссел " + count);
//
//
//        System.out.println();
//============================================================================================================

//        Напишите программу, которая выведет в консоль следующую пирамидку:
//
//        55555
//        4444
//        333
//        22
//        1
//
//        int rows = 5; // Количество строк в пирамидке
////
//        for (int i = rows; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i); // Выводим текущее значение строки i раз
//            }
//            System.out.println(); // Переходим на следующую строку
//        }

//        Дан массив:
//
//   int[][][] arr = {
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//};
//Выведите в консоль сумму всех элементов этого массива.


//
//        int[][][] arr = {
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//	{
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//		{1, 2, 3, 4, 5},
//	},
//};
//
//        int sum = 0;
//        for (int[][] matrix : arr) {
//            for (int[] row : matrix) {
//                for (int num : row) {
//                    sum += num;
//                }
//            }
//        }
//
//        System.out.println("Сумма элементов массива: " + sum);
//=======================================================================================================================

//		Дано некоторое целое число://
//      int num = 12345;
//      Проверьте, что цифры этого числа расположены по возрастанию.
//        int num = 12345;
//        boolean isAscending = isDigitsAscending(num);
//        if (isAscending) {
//            System.out.println("Цифры числа расположены по возрастанию.");
//        } else {
//            System.out.println("Цифры числа не расположены по возрастанию.");
//        }
//    }
//
//    public static boolean isDigitsAscending(int num) {
//        String numStr = String.valueOf(num);
//        for (int i = 1; i < numStr.length(); i++) {
//            if (numStr.charAt(i) <= numStr.charAt(i - 1)) {
//                return false;
//            }
//        }
//        return true;
//        ===============================================================================================================
//        Дан некоторый массив://
//        int[] arr = {123, 456, 789};
//        Получите массив первых цифр входящих в первый массив чисел://
//        byte[] {1, 4, 7};

//        int[] arr = {123, 456, 789};
//        int[] arr1 = new int[arr.length];
//
//           for (int i = 0; i < arr.length; i++) {
//               int firstDigit = String.valueOf(arr[i]).charAt(0) - '0';
//               arr1[i] = firstDigit;
//               }
//               System.out.println(Arrays.toString(arr1));
//        ==================================================================================================================
//         Сформируйте с помощью циклов следующий массив:
//
//        char[] {
        //	{'x', 'x', 'x'},
        //	{'x', 'x', 'x'},
        //	{'x', 'x', 'x'},
//           }


//        char[][] array = new char[3][3];
//
//// Заполняем массив символом 'x'
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = 'x';
//            }
//        }
//
//// Выводим массив на экран
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }

        //========================================================================================================================


//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                               };
//
//
//        System.out.println("Главная диагональ:");
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    System.out.print(array[i][j] + " ");
//                }
//            }
//        }
//        System.out.println();
//
//// Вывод побочной диагонали
//        System.out.println("Побочная диагональ:");
//        for (int i = array.length - 1; i >= 0; i--) {
//            for (int j = 0; j < array.length; j++) {
//                         if (i == j)
//                    System.out.print(array[i][j] + " ");
//                }
//            }


//  Уровень 5.5 задачника Java

//  Попросите у пользователя ввести через консоль целое число из промежутка от 1 до 10. Если будет введено что-то другое, то попросите пользователя ввести число еще раз.


//        Scanner scanner = new Scanner(System.in);
//        int number;
//
//        do {
//            System.out.println("Введите целое число от 1 до 10:");
//            while (!scanner.hasNextInt()) {
//                System.out.println("Это не целое число. Попробуйте еще раз:");
//                scanner.next(); // Перемещаем курсор на следующую позицию ввода
//            }
//            number = scanner.nextInt();
//
//            if (number < 1 || number > 10) {
//                System.out.println("Число должно быть от 1 до 10. Попробуйте еще раз.");
//            }
//        } while (number < 1 || number > 10);
//
//        System.out.println("Вы ввели число: " + number);

//===========================================================================================================================
//        Сформируйте с помощью циклов следующий массив:

//int[] {
//            {1, 2, 3},
//            {1, 2, 3},
//            {1, 2, 3},
//            {1, 2, 3},
//            {1, 2, 3},
        //       }

//        int[][] array = new int[5][3];
//
//// Заполняем массив значениями от 1 до 3 в каждой строке
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < 3; j++) {
//                array[i][j] = j + 1;
//               }
//        }
//
// //Выводим массив на экран
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//       }

//=======================================================================================================================
//       Дана некоторая строка:
//      "abcdeabc"
//       Очистите ее от дублей символов:
//       "abcde"

//        String str = "abcdeabc";
//
//        Pattern pattern = Pattern.compile("abcde");
//        Matcher matcher = pattern.matcher(str);
//        String result = "";
//
//        if (matcher.find()) {
//            result = matcher.group();
//        }
//
//        System.out.println(result);

//        String str = "abcdeabc";
//
//        // Преобразуем строку в набор символов (LinkedHashSet сохраняет порядок)
//        LinkedHashSet<Character> set = new LinkedHashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            set.add(str.charAt(i));
//        }
//
//        // Формируем строку из набора символов
//        StringBuilder result = new StringBuilder();
//        for (char c : set) {
//            result.append(c);
//        }
//
//        // Выводим итоговую строку
//        System.out.println("Очищенная от дублей строка: " + result.toString());
//=======================================================================================================================

//    Дана некоторая строка:
//   "abcde"
//    Переведите в верхний регистр все нечетные буквы этой строки. В нашем случае должно получится следующее:
//   "AbCdE"

//        String str = "abcde";
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i++)
//            if ((i + 1) % 2 != 0) {
//                result.append(Character.toUpperCase(str.charAt(i)));
//            } else {
//                result.append(str.charAt(i));
//
//    }
//        System.out.println(result);
//========================================================================================================================
        // Уровень 5.6 задачника Java
        //Напишите программу, которая будет находить корни квадратного уравнения. Для этого спросите у пользователя три числа, которые будут коэффициентами уравнения.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Введите коэффициенты квадратного уравнения ax^2 + bx + c = 0:");
//        System.out.print("Введите коэффициент a: ");
//        double a = scanner.nextDouble();
//        System.out.print("Введите коэффициент b: ");
//        double b = scanner.nextDouble();
//        System.out.print("Введите коэффициент c: ");
//        double c = scanner.nextDouble();
//
//        double[] roots = findRoots(a, b, c);
//
//        System.out.println("Корни уравнения:");
//        for (double root : roots) {
//            System.out.println(root);
//        }
//    }
//
//    public static double[] findRoots(double a, double b, double c) {
//        double discriminant = b * b - 4 * a * c;
//        double[] roots;
//
//        if (discriminant > 0) {
//            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            roots = new double[]{root1, root2};
//        } else if (discriminant == 0) {
//            double root = -b / (2 * a);
//            roots = new double[]{root};
//        } else {
//            roots = new double[]{Double.NaN, Double.NaN}; // корни являются комплексными числами
//        }
//
//        return roots;

//=========================================================================================================================

        //       Сформируйте с помощью циклов следующий массив:
//           int[] {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//        }

//        int[][] array = new int[3][3];
//        int count = 1;
//
//        // Заполнение массива
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                array[i][j] = count++;
//            }
//        }
//
//        // Вывод массива
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//=====================================================================================================================
//      Даны два числа:
//
//     int num1 = 12345;
//     int num2 = 45678;
//     Выведите в консоль цифры, которые есть и в одном, и в другом числе.

//        int num1 = 12345;
//        int num2 = 45678;
//        int num3 = 0;
//        String str = "";
//
//        while (num1 > 0) {
//            int digit1 = num1 % 10;
//            int tempNum2 = num2; // Создаем временную копию num2 для каждой итерации num1
//            while (tempNum2 > 0) {
//                int digit2 = tempNum2 % 10;
//                if (digit2 == digit1) {
//                    str += digit2;
//                }
//                tempNum2 = tempNum2 / 10;
//            }
//            num1 = num1 / 10;
//        }
//        num3 = Integer.parseInt(str);
//        System.out.println(num3);

//        ===============================================================================================================
//
// Выведите в консоль все числа в промежутке от 10 до 1000, сумма первой и второй цифры которых равна пяти.
//        for (int i = 10; i <= 1000; i++) {
//            int firstDigit = Character.getNumericValue(String.valueOf(i).charAt(0));
//            int secondDigit = Character.getNumericValue(String.valueOf(i).charAt(1));
//            if (firstDigit + secondDigit == 5) {
//                System.out.println(i);
//            }
//        }
//        ==============================================================================================================


//        Дан массив:
//
//        {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9},
//        }
//        Слейте элементы этого массива в один одномерный массив:
//
//        {1, 2, 3, 4, 5, 6, 7, 8, 9}

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//
//        int size = 0;
//        for (int[] matrix : arr) {
//            for (int row : matrix)
//                size++;
//        }
//
//
//        int[] arr2 = new int[size];
//        for (int[] matrix : arr) {
//            for (int row : matrix) {
//                arr2[row - 1] = row;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));


//        ==============================================================================================================
//        Даны две строки:
//
//        String str1 = "12345";
//        String str2 = "45678";
//        Получите символы, которые есть и в одной, и в другой строке:
//
//        "45"


//        String str1 = "12345";
//        String str2 = "45678";
//
//        // Создаем множества для символов из каждой строки
//        Set<Character> set1 = new HashSet<>();
//        Set<Character> set2 = new HashSet<>();
//
//        // Заполняем множества символами из строк
//        for (char c : str1.toCharArray()) {
//            set1.add(c);
//        }
//        for (char c : str2.toCharArray()) {
//            set2.add(c);
//        }
//
//        // Находим пересечение множеств
//        set1.retainAll(set2);
//
//        // Преобразуем результат в строку
//        StringBuilder result = new StringBuilder();
//        for (char c : set1) {
//            result.append(c);
//        }
//
//        System.out.println(result.toString());
    }
}












































































