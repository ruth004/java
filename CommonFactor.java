import java.util.Scanner;
  public class CommonFactor{
    public static void main(String[]args){
  Scanner input = new Scanner(System.in);

System.out.println("Enter number");
int CommonFactor = input.nextInt();


for(int index = 1; index <= CommonFactor; index++){
if(CommonFactor % index == 0){

System.out.println( index );

}
}
}
}
