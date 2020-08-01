
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class Student {
      String name;
      int age;
      int marks;
      String rollNumber;
      public Student(String name, String rollNumber, int age, int marks){
          this.name = name;
          this.age = age;
          this.marks = marks;
          this.rollNumber = rollNumber;
      }
    } 
    
public class Main 
{ 
    
  //sort method 
    public Collection<Student> sort(Collection<Student> students, String[] criteria){
    Collections.sort(students, new Comparator<Student>() {  
        @Override  
        public int compare(Student s1, Student s2) { 
            compareBu = CompareToBuilder();
            for(i=0;i<criteria.length;i++){
                compareBu.append(s1.criteria[i],s2.criteria[i]);
            }
            return new compareBu.toComparison();  
        }  
      });  
    }

    public static void main (String[] args) 
    { 
        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student("akshay", 26, 34, 01)); 
        ar.add(new Student("abhay", 36, 35, 04)); 
        ar.add(new Student("akshay2", 36, 37, 03)); 
    }
    s1 = sort(ar, ["name"]);
    s2 = sort(ar, ["name","age"]);
}
