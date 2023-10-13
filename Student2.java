public class Student2 {
    private String name;
    private String college;
    public Student2(String name, String college) {
        super();
        this.name = name;
        this.college = college;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
     public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }
    public static void main(String[] args) {
        new Student2("Ramesh", "BVB");
        new Student2("Prakash", "GEC");
        new Student2("Pramod", "IIT");
 }
}
