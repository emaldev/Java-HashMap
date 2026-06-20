import java.util.HashMap;

public class ShapingManager{
    public static void main(String[] args){

        HashMap<String, Integer> name = new HashMap<>();

        name.put("Loptop", 50);
        name.put("Mouse", 20);
        name.put("Keyboard", 15);

        System.out.println(name.values());

        for(String i : name.keySet()){
            System.out.println(i);
        }

        
    }
}