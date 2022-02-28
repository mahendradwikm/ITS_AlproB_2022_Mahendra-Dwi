import java.util.Scanner;


public class ProcessAName5026211102 {
    
    
public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Masukkan namamu: ");
        
        String name = console.nextLine();
        int space = name.indexOf(' ');
        String firstname = name.substring(0,1);
        System.out.println(space);
        String lastname = name.substring(space);

        
        System.out.println("Namamu adalah "+lastname+", "+firstname+".");
        
    }
}