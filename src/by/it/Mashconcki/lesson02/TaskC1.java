package by.it.Mashconcki.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Ввод:");
int a=sc.nextInt();
int b=sc.nextInt();
sc.close();
  int result=a+b;
System.out.println("Вывод:");
System.out.print("Sum="+result);
    }





}
