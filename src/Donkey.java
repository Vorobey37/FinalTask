
public class Donkey extends PackAnimals {
    
    protected String category = "PackAnimals";

    public Donkey(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void toPet() {
        System.out.println(name + " говорит: И-и-а-а");
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + type + ", " + birthDate + ", " + category;
    }
}
