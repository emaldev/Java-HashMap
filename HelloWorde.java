import java.util.HashMap;
import java.util.Map;

public class HelloWorde{
    public static void main(String[] args){
        HashMap<String, Integer> name = new HashMap<>();

        name.put("Loptope", 12);
        name.put("Mouse", 3);
        name.put("HardDisk", 90);

        System.out.println(name.get("Mouse"));
     
        int seal = name.get("Mouse");
        name.put("Mouse", seal-1);

        System.out.println("this is the for-each loop");
        for(Map.Entry<String, Integer> entry: name.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}