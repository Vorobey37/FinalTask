
public class Horse extends PackAnimals {

    protected String category = "PackAnimals";

    public Horse(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void toPet() {
        System.out.println(name + " говорит: И-го-го");
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + type + ", " + birthDate + ", " + category;
    }
}
