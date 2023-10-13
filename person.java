public class person {
    private String fname;
    private String lname;

    public String getfname(){
        return fname;  
    }
    public void setfname(String fname){
        this.fname=fname;
    }
    public String getlname(){
        return lname;  
    }
    public void setlname(String lname){
        this.lname=lname;
    }
    public String toString(){
        return "person [firstname="+fname + ", lastname="+lname+"]";
        
    }
    public void setlnam(String string) {
    }
    public static void main(String []args){
        person Obj=new person();
        Obj.setfname("John");
        Obj.setlname("Miller");
        System.out.println(Obj.toString());
    }
}
