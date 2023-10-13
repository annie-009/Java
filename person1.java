public class person1 {
    String name;
    int age;
    public person1(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void introduce(){
    System.out.println("My name is " + name);
    }
}
   class Artist extends person1{
    String genre;
    public Artist(String name, int age, String genre) {
        super(name, age);
        this.name=name;
        this.age=age;
        this.genre=genre;
    }

    public void playMusic(){
        System.out.println(name+" is playing "+genre+ " music");
    }
    public static void main(String[] args){
        Artist obj = new Artist("Neo",25,"Western");
        obj.introduce();
        obj.playMusic();
    
    }
}