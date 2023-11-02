
import java.util.ArrayList;
import java.util.Arrays;

public class PackAnimals extends Animals {

    protected String[] possibleCommands = {"sit", "trot", "canter", "gallop", "walk", "carry load", "bray", "kick", "jump", "run"};

    public PackAnimals(int id, String name, String type, String birthDate) {
        super(id, name, type, birthDate);
        
    }

    public String[] getPossibleCommands() {
        return possibleCommands;
    }  

    @Override
    public void learnCommand(String commandToLearn) {
        if (!Arrays.asList(possibleCommands).contains(commandToLearn)) {
            System.out.println("Данную команду " + name + " не сможет выучить!");
        } else if (currentCommands.contains(commandToLearn)) {
            System.out.println("Эту команду " + name + " уже знает!");
        } else {
        currentCommands.add(commandToLearn);
        System.out.println(name + " выучел(а) команду: " + commandToLearn);
        }
    }

    @Override
    public void useCommand(String commandToUse) {
        if (!currentCommands.contains(commandToUse) && Arrays.asList(possibleCommands).contains(commandToUse)) {
            System.out.println("Данную команду " + name + " не знает, но может выучить!");
        } else if (!currentCommands.contains(commandToUse)) {
            System.out.println("Данную команду " + name + " не знает!");
        } else {
            System.out.println(name + " выполняет команду: " + commandToUse);
        }
        
    }

    @Override
    public String toString() {
        return id + "," + name + "," + type + "," + birthDate;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public ArrayList<String> getCurrentCommands() {
        return currentCommands;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void toPet() {
        // Здесь пока ничего нет...
        
    }  
    
}
