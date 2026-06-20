
import java.util.HashMap;
import java.util.Map;

public class PhoneBookApp {
    public static void main(String[] args){
        
        HashMap<String, String > PhoneBook = new HashMap<>();

     PhoneBook.put("Milad Azimi", "09908998679" );
        PhoneBook.put("Ali", "067845678567");
        PhoneBook.put("Asef Habibi", "099887644335");
        PhoneBook.put("Sara", "09902355");
         
        System.out.println(PhoneBook.get("Milad Azimi"));
        PhoneBook.remove("Asef Habibi");
         
        System.out.println("This is my connect number.");
        for(Map.Entry<String, String> entry : PhoneBook.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        
    }
    
}
