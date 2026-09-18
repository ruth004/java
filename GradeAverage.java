import java.util.Scanner;

public class GradeAverage{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 0;

while(gradeCounter <= 10){
System.out.print("Enter Grade");
int grade = input.nextInt();
total += grade;
gradeCounter++
}

int average = total / 10;

System.out.println("total grade of all student is" + total);
System.out.println("class average is" + average);
}

}
