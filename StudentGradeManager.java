import java.util.HashMap;
import java.util.Map;
public class StudentGradeManager {
    public static void main(String[] args){
        HashMap<String, Integer> studentgrade  = new HashMap<>();

        studentgrade.put("Ahmad", 18);
        studentgrade.put("Ali", 17);
        studentgrade.put("Mohammad", 18);
        studentgrade.put("Sara", 19);
        studentgrade.put("Mehnaz", 16);
        studentgrade.put("Mohsen", 20);

        System.out.println(studentgrade.get("Mohammad"));

        int sel = studentgrade.get("Mohammad");
        studentgrade.put("Mohammad", sel -3);

    
         
        for(Map.Entry<String, Integer> entry: studentgrade.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    
    }

}