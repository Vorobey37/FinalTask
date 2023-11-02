
import java.util.ArrayList;

public abstract class Animals {

    protected int id;
    protected String name;
    protected String type;
    protected String birthDate;
    /**
     *Список команд, которые знает животное
     */
    protected ArrayList<String> currentCommands = new ArrayList<>();

    public Animals(int id, String name, String type, String birthDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.birthDate = birthDate;
    }

    /**Метод позволяет выучить команду
     * @param commandToLearn
     */
    abstract public void learnCommand(String commandToLearn);

    /**Метод позволяет выполнить команду
     * @param commandToUse
     */
    abstract public void useCommand(String commandToUse);

    /**
     * Метод позволяет погладить животного
     */
    abstract public void toPet();

    abstract public int getId();
    abstract public String getName();
    abstract public String getType(); 
    abstract public String getBirthDate();
    abstract public ArrayList<String> getCurrentCommands();

    
}
