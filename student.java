public class student {
    String name;
    int age;
    int roll_no;

    void info(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll_No:"+roll_no);
    }
    public static void main(String[] args){
        student std = new student();
        std.name="John";
        std.age=24;
        std.roll_no=12;

        //Calling Method
        std.info();

    }
}
