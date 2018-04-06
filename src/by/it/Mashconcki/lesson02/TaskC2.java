package by.it.Mashconcki.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.math.BigInteger;
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int x=a+b;
        System.out.println("DEC:"+a+"+"+b+"="+x);
        String converta = Integer.toBinaryString(a);
        String convertb = Integer.toBinaryString(b);
        String convertx = Integer.toBinaryString(x);
        System.out.println("BIN:"+converta+"+"+convertb+"="+convertx);
        converta = Integer.toHexString(a);
        convertb = Integer.toHexString(b);
        convertx = Integer.toHexString(x);
        System.out.println("HEX:"+converta+"+"+convertb+"="+convertx);
        converta = Integer.toOctalString(a);
        convertb = Integer.toOctalString(b);
        convertx = Integer.toOctalString(x);
        System.out.println("OCT:"+converta+"+"+convertb+"="+convertx);
    }


}
