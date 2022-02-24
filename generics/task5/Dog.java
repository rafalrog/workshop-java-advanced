package generics.task5;

public class Dog extends Animal {

    private String tail;

    public Dog(String name, String tail) {
        super(name);
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tail='" + tail + '\'' +
                "} " + super.toString();
    }
}
