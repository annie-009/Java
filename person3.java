public class person3 {
    private double id;
    private String name;

    public person3() {
        // Only Person class can access and assign
        id = Math.random();
        sayHello();

    }

    private void sayHello() {
        System.out.println("Hello - " + getId());
    }

    public double getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        person3 obj = new person3();
        obj.setid(3);
        obj.setName("Miller");
        System.out.println(obj.toString());
    }

    private void setid(int i) {
    }
}