
public class Camel extends PackAnimals {

    protected String category = "PackAnimals";

    public Camel(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void toPet() {
        System.out.println(name + " говорит: Прр-Прр");
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + type + ", " + birthDate + ", " + category;
    }
}
