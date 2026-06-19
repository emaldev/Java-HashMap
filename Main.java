import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        HashMap<String, String> names = new HashMap<String, String>();

        names.put("Germany" , "Berlin");
        names.put("Norway", "Oslo");
        names.put("England", "London");
        names.put("Iran", "Tehran");
        names.put("Afghanistan", "Kabul");
        names.put("Russia", "Moscow");
              names.remove("Germany");
            
              
        System.out.println(names.values());
         System.out.println("============this is =================");
        System.out.println(names.keySet());
         System.out.println("============this is =================");
        System.out.println(names.get("Afghanistan"));
         System.out.println("============this is =================");
        for(String i : names.values()){
            System.out.println(i);
        }
         System.out.println("============this is =================");
        for(String i : names.keySet()){
           System.out.println(i);
        }


       

    }
}