import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        int no_students=sc.nextInt(),i;
        System.out.println("Enter the no of subjects");
        int no_subjects=sc.nextInt();
        HashMap<Integer,ArrayList<Integer>> student_data=new HashMap<>();
        HashMap<Integer,Integer> rs=new HashMap<>();
        
        
        //Take the student id and their marks from the user
        for(i=0;i<no_students;i++)
        {
            System.out.println("Enter Student id:");
            int id=sc.nextInt();
            int res=0;
            int limit=0;
            System.out.println("Enter marks of the students ");
            ArrayList<Integer> marks=new ArrayList<>();
            for(limit=0;limit<no_subjects;limit++)
            {
                marks.add(sc.nextInt());
            }
            for(Integer mark:marks)
            {
                res+=mark;
            }
            rs.put(id,res);
            student_data.put(id,marks);
        }
        
        System.out.println("Student data and their marks are:");
        System.out.println(student_data);
        
        System.out.println("Enter the student id whose total marks you want to calculate");
        
        int required_id=sc.nextInt();
        int total=rs.get(required_id);
        System.out.println("Print student id and their total marks:");
        System.out.println("Student ID: " + required_id + " Total Marks: " + total);
        
    }
}
