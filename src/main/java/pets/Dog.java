package pets;

public class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {


        return " Woof! ";
    }
}
