import java.util.HashMap;
import java.util.Map;

public class HelloWorde{
    public  static void main(String[] args){
        HashMap<String, Integer> name = new HashMap<>();

        name.put("Loptop", 12);
        name.put("Apple", 14);
        name.put("coffee", 23);

        int seal = name.get("Apple");
        name.put("Apple", seal-1);

        for(Map.Entry<String, Integer> entry: name.entrySet()){
        System.out.println("This is " + entry.getKey() + ": " + entry.getValue());
        }
        
    }
}