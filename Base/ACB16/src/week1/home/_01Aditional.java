package week1.home;

import java.util.Scanner;

/**
 * 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */
public class _01Aditional {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a ");
     double a = sc.nextDouble();
     System.out.println("Enter b ");
     double b = sc.nextDouble();
     System.out.println("Enter c ");
     double c = sc.nextDouble();


    if(a * a == b * b + c * c |
            b * b == a * a + c * c |
            c * c == b * b + a * a){
     System.out.println("Rectangle");
    } else {
     System.out.println("Not rectangle");
    }
 }
}
