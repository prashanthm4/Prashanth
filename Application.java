* Description: A program to check whether the input
 * integer number is positive or negative. 
 * Written by: Chaitanya Singh
 * Published on: beginnersbook.com
 */
#include <stdio.h>
 
void main()
{
    int num;
 
    printf("Enter a number: \n");
    scanf("%d", &num);
    if (num > 0)
        printf("%d is a positive number \n", num);
    else if (num < 0)
        printf("%d is a negative number \n", num);
    else
        printf("0 is neither positive nor negative");
 
# feature 202 changes done by prashi on reg module
// declare variables
      int num1, num2, sum;

      // take two numbers
      num1 = 10;
      num2 = 20;

      // calculate sum value
      sum = num1 + num2;

      // display the sum value
      System.out.println("Sum = " + sum);


# feature201 changes done by SUMAN on reports module
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
 
