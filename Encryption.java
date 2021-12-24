package encryption;
import java.util.Scanner;


public class Encryption {
    public static void main(String[] args) {
        // TODO code application logic here
        String userText = getText();
        System.out.println(EncryptionProcedures.periodicEncrypt(userText));
        
    }
    
    private static String getText(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a text to encrypt: ");
        String userText = sc.nextLine();
        return userText;
    }
}
