import java.util.Scanner;
public class Meter{
public static void main(String[] args){

double subtotal = 10;
double gratuityrate = 12;
double gravity = subtotal * gratuityrate / 100;
double total = gratuityrate * subtotal;

System.out.println("the gratuity is" + gravity + "and total is" + total);

}

}
