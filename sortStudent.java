import java.util.*; 
import java.lang.*; 
import java.io.*; 
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Student {
      String name;
      int age;
      int marks;
      String rollNumber;
      public Student(String name,int age, int marks, String rollNumber){
          this.name = name;
          this.age = age;
          this.marks = marks;
          this.rollNumber = rollNumber;
      }
      //Sort function with camprator ;
      public static Collection<Student> sortStudent(Collection<Student> students, String[] criteria){
          List<Student> st= new ArrayList<Student>(students);
        Collections.sort(st, new Comparator<Student>() {  
            @Override  
            public int compare(Student s1, Student s2) { 
                CompareToBuilder compareToBuilder =  new CompareToBuilder();
                for(int i=0;i<criteria.length;i++){
                    if(criteria[i] == "name"){
                        compareToBuilder.append(s1.name,s2.name);
                    }
                    if(criteria[i] == "age"){
                        compareToBuilder.append(s1.age,s2.age);
                    }
                    if(criteria[i] == "marks"){
                        compareToBuilder.append(s1.marks,s2.marks);
                    }
                    if(criteria[i] == "rollNumber"){
                        compareToBuilder.append(s1.rollNumber,s2.rollNumber);
                    }
                    
                }
                return compareToBuilder.toComparison();  
            }  
        });  
    }

    public static void main (String[] args) 
    { 
        ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student("akshay", 26, 34, "01")); 
        ar.add(new Student("abhay", 36, 35, "04")); 
        ar.add(new Student("akshay2", 36, 37, "03")); 
    
        String[] cr1 = {"name"};
        String[] cr2 = {"name","age"};
        Collection<Student> s1 = sortStudent(ar, cr1);
        Collection<Student> s2 = sortStudent(ar, cr2);
    }
      
      
} 
    
    // time complexity of compare function O(n) with space complexity O(1)
// time complexity of 
    
