
public class Hamster extends Pets {
    
    protected String category = "Pets";

    public Hamster(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void toPet() {
        System.out.println(name + " говорит: Пшш-Пшш");
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + type + ", " + birthDate + ", " + category;
    }
}
