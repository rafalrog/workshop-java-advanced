package generics.task5;

public class Cat extends Animal {

    private String claws;

    public Cat(String name, String claws) {
        super(name);
        this.claws = claws;
    }

    public String getClaws() {
        return claws;
    }

    public void setClaws(String claws) {
        this.claws = claws;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "claws='" + claws + '\'' +
                "} " + super.toString();
    }
}
