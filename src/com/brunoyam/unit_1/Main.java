package com.brunoyam.unit_1;

import com.brunoyam.unit_1.utils.Generator;

import java.util.Arrays;

public class Main {

    /*
    Условия:
    oneDimensionArray - массив содержащий не меньше 3 и не больше 99 элементов типа int.
    Среди них всегда есть хотя бы одно положительное, хотя бы одно отрицательное и хотя бы один 0.

    Подсказки:

    Для выполнения задания вспомните максимальные и минимальные значения целочисленных типов.

    Длина массива хранится в поле length. Например, длину массива myArray можно получить так: int myArrayLength = myArray.length

    Для выходя из метода используется ключевое слово return. Если после него стоит значение (или переменная), то это значение будет возвращено как результат работы метода.

    Метод main расположен последним в классе (находится в самом низу)

     */

    private static int[] oneDimensionArray = Generator.getOneDimensionArray();

    private static void level1() {
        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод, вычисляющий значение переменной должен возвращать тот же тип.
        */
        int minValue = findMinValue(oneDimensionArray);
        int maxValue = findMaxValue(oneDimensionArray);
        long sumOfValues = sumValues(oneDimensionArray);
        byte firstPositiveIndex = getFirstPositiveIndex(oneDimensionArray);
        byte firstNegativeIndex = getFirstNegativeIndex(oneDimensionArray);


        System.out.println("First part");

        System.out.println("min: " + minValue);
        System.out.println("max: " + maxValue);
        System.out.println("sum: " + sumOfValues);

        System.out.println();
        System.out.println("length: " + oneDimensionArray.length);
        System.out.println("first positive index: " + firstPositiveIndex);
        System.out.println("first negative index: " + firstNegativeIndex);
    }

    private static void level2() {

        /*
         Выберите подходящий тип переменных, в которые будут сохраняться значения.
         Не забудьте, что метод должен возвращать значение тогот же типа.
        */
        byte lastPositiveIndex = getLastPositiveIndex(oneDimensionArray);
        byte lastNegativeIndex = getLastNegativeIndex(oneDimensionArray);
        byte[] positiveNegativeNumber = countPositiveNegative(oneDimensionArray);

        System.out.println("last positive index: " + lastPositiveIndex);
        System.out.println("last negative index: " + lastNegativeIndex);
        System.out.println("total positives: " + positiveNegativeNumber[0]);
        System.out.println("total negatives: " + positiveNegativeNumber[1]);
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int findMinValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int minValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните минимальное в переменную minValue.
         */
        for (int i = 0; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] < minValue) {
                minValue = arrayOfValues[i];
            }
        }
        return minValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static int findMaxValue(int[] arrayOfValues) {
        /* Укажите тип переменной */
        int maxValue = arrayOfValues[0];
        /*
           Используя цикл for переберите все значения массива и сохраните максимальное в переменную maxValue.
         */
        for (int i = 0; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] > maxValue) {
                maxValue = arrayOfValues[i];
            }
        }
        return maxValue;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static long sumValues(int[] arrayOfValues) {
        /* Укажите тип переменной */
        long sum = 0;
        /* Используя цикл for переберите все значения массива, просуммируйте и сохраните сумму всех значений в переменную sum. */
        for (int i = 0; i < arrayOfValues.length; i++) {
            sum += arrayOfValues[i];
        }
        return sum;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static byte getFirstPositiveIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        byte firstPositiveIndex = 0;
        /* Используя цикл while найдите индекс первого положительного значения в массиве и сохраните в переменную firstPositiveIndex */
        while(firstPositiveIndex < arrayOfValues.length
                && arrayOfValues[firstPositiveIndex] >= 0) {
            firstPositiveIndex++;
        }
        return firstPositiveIndex;
    }

    /* Укажите тип значения, которое будет возвращать метод*/
    private static byte getFirstNegativeIndex(int[] arrayOfValues) {
        /* Укажите тип переменной */
        byte firstNegativeIndex = 0;
        /* Используя цикл while найдите первое отрицательное значение и сохраните в переменную firstNegativeIndex */
        while(firstNegativeIndex < arrayOfValues.length
                && arrayOfValues[firstNegativeIndex] <= 0) {
            firstNegativeIndex++;
        }
        return firstNegativeIndex;
    }
    /* Укажите тип значения, которое будет возвращать метод*/
    private static byte getLastPositiveIndex(int[] arrayOfValues) {
        byte lastPositiveIndex = (byte) (arrayOfValues.length - 1);
        /*
        Найдите последнее положительное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */
        while(lastPositiveIndex >= 0
                && arrayOfValues[lastPositiveIndex] >=0) {
            lastPositiveIndex --;
        }

        return lastPositiveIndex;
    }
    /* Укажите тип значения, которое будет возвращать метод*/
    private static byte getLastNegativeIndex(int[] arrayOfValues) {
        byte lastNegativeIndex = (byte) (arrayOfValues.length - 1);
        /*
        Найдите последнее отрицательное значение в массиве.
        Верните найденное значение используя ключевое слово return.
         */
        while(lastNegativeIndex >= 0
                && arrayOfValues[lastNegativeIndex] <=0) {
            lastNegativeIndex --;
        }

        return lastNegativeIndex;
    }
    private static byte[] countPositiveNegative(int[] arrayOfValues) {
        byte[] result = new byte[2];

        /*
        Посчитайте количество положительных и отрицательных значений в массиве arrayOfValues.
        Результат сохраните в массив result:
            В первый элемент - количество положительных
            Во второй элемент - количество отрицательных
         */
        byte countPositive = 0;
        byte countNegative = 0;
        for (byte i = 0; i < arrayOfValues.length; i++) {
            if (arrayOfValues[i] > 0) {
                countPositive++;
                result[0] = countPositive;
            } else if (arrayOfValues[i] < 0) {
                countNegative++;
                result[1] = countNegative;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        level1();
        level2();
    }
}