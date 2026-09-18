public class SumOfInteger{
public static void main(String [] args){


int number = 234;

int firstDigit = number % 10;
number = number / 10;

int secondDigit = number % 10;
number = number / 10;

int thirdDigit = number % 10;


int sum = firstDigit + secondDigit + thirdDigit;

System.out.println("the sum is" + sum)

}

}
