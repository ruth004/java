import java.util.Scanner;
public class AgeDeterminant{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("enter your age");
int age = input.nextInt();


if(age < 18){
System.out.println("your a child");
} else {
System.out.println("your an adult");
}

}


}
