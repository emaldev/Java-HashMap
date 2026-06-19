import java.util.HashMap;



public class StudentGrades {
    public static void main(String[] args){
        HashMap<Integer, Student> names = new HashMap<>();

        names.put(101, new Student("Milad Azimi", 18.5));
        names.put(102, new Student("Asef Habib", 17.5));
        names.put(103, new Student("Ali", 19));
        names.put(104, new Student("Sana safi", 15));

       for(Integer key : names.keySet()){
        System.out.println(key + ": " + names.get(key));
       }
    }
    
}
