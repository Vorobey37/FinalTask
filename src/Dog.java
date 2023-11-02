
public class Dog extends Pets {
    
    protected String category = "Pets";

    public Dog(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void toPet() {
        System.out.println(name + " говорит: Гав-Гав");
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + type + ", " + birthDate + ", " + category;
    }
}
