package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Создать произвольные строки разными вариантами:
//        1) Литерал
//        2) new
//        3) массив символов
//        4) из байтов
//        5) С помощью StringBuilder

        String string1 = "string1 ";
        String string2 = new String("string2 ");
        char[] arrChar = {'s','t','r','i','n','g','3',' '};
        String string3 = new String(arrChar);
        String str = "string4 ";
        String string4 = new String(str.getBytes());
        StringBuilder builder = new StringBuilder("string5 ");
        String string5 = new String(builder);

//        Работа с строкой
//        1) Создать строку “Апельсин,Яблоко,Гранат,Груша”.
//        2) Воспользоваться методом split для извлечения всех названий фруктов в массив.
//        3) Найти и вывести на экран самое длинное название фрукта с преобразованием
//        всех символов в нижний регистр.
//        4) Создать «сокращенный» вариант названия фрукта. Получить подстроку из
//        первых 3-х символов названия фрукта. Вывести на экран.


                String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] arrFruits = fruits.split(",");
        int lengthStrings = 0;
        String arrayObject = new String();
        for (int i = 0; i < arrFruits.length; i++) {
            if (lengthStrings < arrFruits[i].length()){
                lengthStrings = arrFruits[i].length();
                arrayObject = arrFruits[i];

            }

        }
        arrayObject = arrayObject.toLowerCase();
        System.out.println(arrayObject);
        arrayObject = arrayObject.substring(0, 3);
        System.out.println(arrayObject);


//        5) Создать строку “ Я_новая_строка ”. (с такими же пробелами)
//        6) Преобразовать строку: Убрать лишние пробелы в начале и конце
//        7) Преобразовать строку: заменить все символы ‘_’ на пробелы.
//        8) Вывести окончательный вариант на экран.

        String string6 = " Я_новая_строка  ";
        string6 = string6.trim();
        string6 = string6.replace("_", " ");
        System.out.println(string6);


//        9) Создать Scanner для ввода текста. Выводим на экран сообщение с текстом: «Вы
//        ввели: <ваш текст>»
//        10) Добавить проверку: если введенный текст начинается со слова “Запуск”,
//        выводим на экран «Запускаем процесс»
//        11)Добавить проверку: если введенный текст заканчивается на слово “завершен”,
//        выводим на экран «Процесс завершен»
//        12)Добавить проверку: если введенный текст содержит слово “ошибка” (с любым
//        регистром букв), выводим на экран «Произошла ошибка»

        Scanner scanner = new Scanner(System.in);
        System.out.println("Рекомендуемый текст для ввода:   Запускаем процес,хотя нет,там какая-то ошибка, пусть процес лучше будет завершен");
        str = scanner.nextLine();
        str = str.trim();
        System.out.println("Вы ввели: " + str);
        System.out.println();
        //Запускаем процес,хотя нет,там какая-то ошибка, пусть процес лучше будет завершен
        if (str.startsWith("Запуск")){
            System.out.println("Запускаем процесс");
        }if (str.endsWith("завершен")){
            System.out.println("Процесс завершен");

        }
        String str2 = str.toLowerCase();
        if (str2.indexOf("ошибка") != -1){
            System.out.println("Произошла ошибка");

        }

//        Создать StringBuilder:
//        1) Добавить в него все ранее созданные строки.
//        2) После каждой 3-й строки выполнять перенос на новую строку.
//        3) Развернуть содержимое задом на перед.
//        4) Собрать StringBuilder в строку. Вывести ее на экран.
        System.out.println();

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.insert(strBuilder.length(),string1 + string2 + string3 + "\n" + string4 + string5 );
        System.out.println(strBuilder);













    }
}
