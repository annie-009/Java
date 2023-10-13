public class Student1 {
    static int last_roll=100;
    int roll_no;

    Student1(){
        roll_no=last_roll;
        last_roll++;
    }
    public int hashCode(){
        return roll_no;
    }
public static void main(String[]args){
    Student1 Obj =new Student1();
    System.out.println(Obj);
    System.out.println(Obj.toString());
}
}
