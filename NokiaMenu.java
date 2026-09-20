import java.util.Scanner;

public class NokiaMenu{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int currentMenu = 0;
    int nestedMenu = 9;
    int selectedOption;
    boolean appIsStillRunning = true;
    
    while(appIsStillRunning){
      
      switch (currentMenu){
        case 0:
            
          System.out.println("=======================");
          System.out.println("     Nokia 5510 Menu   ");
          System.out.println("=======================");
          System.out.println("1. Phone Book");
          System.out.println("2. Messages");
          System.out.println("3. Chat");
          System.out.println("4. Call Register");
          System.out.println("5.Tone");
          System.out.println("6.Settings");
          System.out.println("-1. Exit");
          break;
          
        case 1:
            
          System.out.println("Phone Book");
          System.out.println("1.Search");
          System.out.println("2.Service");
          System.out.println("3.Add Name");
          System.out.println("4.Erase");
          System.out.println("5.Edit");
          System.out.println("6.Copy");
          System.out.println("7.Assign Tone");
          System.out.println("8.Send B'Card");
          System.out.println("9.Options");
          
          selectedOption = input.nextInt();
              switch(selectedOption){
                  case 9: 
                    System.out.println("\t 1.Memory in use");
                    System.out.println("\t 2.Type of view");
                    System.out.println("\t 3.Memory status");
                    System.out.println("\t 99 Main Menu");
                    break;
                  case 99:
                    currentMenu = 0; 
                    break;
                  case -1:
                    appIsStillRunning = false;
                    break;
              }
              
          System.out.println("0. Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
          
        case 2:
  
          System.out.println("Messages");
          System.out.println("1.Write Message");
          System.out.println("2.Inbox");
          System.out.println("3.Outbox");
          System.out.println("4.Picture Message");
          System.out.println("5.Templates");
          System.out.println("6.Smileys");
          System.out.println("7.Message Settings");
          System.out.println("0.Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
          
        case 3:
            
          System.out.println("Chat");
          System.out.println("0.Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
          
        case 4:
            
          System.out.println("Call Register");
          System.out.println("1.Missed Calls");
          System.out.println("2.Received Calls");
          System.out.println("3.Dialed number");
          System.out.println("4.Erase Recent Call List");
          System.out.println("0.Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
        
        case 5:
            
          System.out.println("Tone");
          System.out.println("1.Ringing Tone");
          System.out.println("2.Ringing Volume");
          System.out.println("3.Incoming Call Alert");
          System.out.println("4.Message Alert Tone");
          System.out.println("5.Keypad Tones");
          System.out.println("6.Warning Tone");
          System.out.println("7.Vibrating Alert");
          System.out.println("8.Screen Saver");
          System.out.println("0.Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
          
        case 6:
            
          System.out.println("Settings");
          System.out.println("1.Call Settings");
          System.out.println("2.Automatic Redial");
          System.out.println("3.Speed dialing");
          System.out.println("4.Call Waiting Options");
          System.out.println("5.Own Number Sending");
          System.out.println("6.Phone Line in Use");
          System.out.println("7.Automatic Answer");
          System.out.println(" 0.Back");
          System.out.println("99 Main Menu");
          System.out.println("-1. Exit");
          break;
          
        default:
          System.out.println("Options Not Found");
          currentMenu = 0;
      }
      
        System.out.println("\n Choose an Option: ");
        
        currentMenu = input.nextInt();
        input.nextLine();
        
        if(currentMenu == 99){
          currentMenu = 0;
          continue;
        }

        if(currentMenu == -1){
          appIsStillRunning = false;
          continue;
        }
        
    
        
      }
  }
  
}
