import java.util.HashMap;
import java.util.Map;
public class StudentGradeManager {
    public static void main(String[] args){
        HashMap<String, Integer> studentgrade  = new HashMap<>();

        studentgrade.put("Ahmad", 18);
        studentgrade.put("Ali", 8);
        studentgrade.put("Mohammad", 18);
        studentgrade.put("Sara", 19);
        studentgrade.put("Mehnaz", 16);
        studentgrade.put("Mohsen", 20);

        System.out.println("---------------------this is the student grade.------------------------------");

        int sel = studentgrade.get("Mohammad");
        studentgrade.put("Mohammad", sel -3);

         
        for(Map.Entry<String, Integer> entry: studentgrade.entrySet()){
             System.out.println("====================<<<<<<<<<<<<<<<<<<<:>>>>>>>>>>>>>>>>>======================");
            if(entry.getValue() < 10){
                System.out.println("this is a  Lazy student. " + entry.getKey() + ":> " + entry.getValue());

            }else if (entry.getValue() >= 18){
                System.out.println("This is a Average Student." + entry.getKey() + ":> " + entry.getValue());

            }else if (entry.getValue() >= 20){

                System.out.println("This is a Capable Student. I love it." + entry.getKey()+ ":> " + entry.getValue());
            }else if(entry.getValue() >= 10 && entry.getValue() <=16){
                System.out.println("this is good Student." + entry.getKey()+":> " + entry.getValue());
            }
            
        }
        
        
    
    }

}