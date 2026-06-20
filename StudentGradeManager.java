import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class StudentGradeManager {
    public static void main(String[] args){
        HashMap<String, Double> studentgrade  = new HashMap<>();
        Scanner input = new Scanner(System.in);
        double grade;
        String  name;
        
         
             for(int i = 0; i < 10; i++){
                System.out.println("Enter name and grade student"+ (i + 1 ) + ": ");
                name = input.nextLine();
                grade =  input.nextDouble();
                input.nextLine();
                
                studentgrade.put(name, grade);
             }

        System.out.println("---------------------this is the student grade.------------------------------");




        for(Map.Entry<String, Double> entry: studentgrade.entrySet()){
             System.out.println("====================<<<<<<<<<<<<<<<<<<<:>>>>>>>>>>>>>>>>>======================");
             if (entry.getValue() >= 20){

                System.out.println("This is a Capable Student. I love it." + entry.getKey()+ ":> " + entry.getValue());
              }else if (entry.getValue() >= 18){
                System.out.println("This is a Average Student." + entry.getKey() + ":> " + entry.getValue());

            }else if(entry.getValue() < 10 ){
                System.out.println("this is a  Lazy student. " + entry.getKey() + ":> " + entry.getValue());

            
            }else if(entry.getValue() >= 10 && entry.getValue() <=16){
                System.out.println("this is good Student." + entry.getKey()+":> " + entry.getValue());
            }
            
        }
        
        
    
    }

}