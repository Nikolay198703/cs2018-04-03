package by.it.Mashconcki.lesson05;

/* Задачка на сортировку
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

import java.util.Scanner;

public class TaskC2 {
    //Напишите тут ваш код
    public static void main(String[] args) {
        int [] arr=new int[20];
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<20;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(arr[5]);


    }




    public static void sort(int[] array) {
        //Напишите тут ваш код
    }

}
