
import java.util.ArrayList;
/**
 * Класс для работы с данными животных, для создания животных.
 */
public class Creator {

    protected ArrayList<Animals> animalsList = new ArrayList<>();
    protected Validator validator = new Validator();
    protected boolean isAddAnimal;
   
    /**
     * Метод для создания животного и добавления в питомник.
     */
    public void add(){

        try {      
            System.out.println("Для добавления нового животного следуйте инструкциям: ");

            System.out.println("Введите имя животного: ");
            String name = View.scanner.nextLine();
            
            System.out.println("На данный момент питомник рассчитан на 6 типов:");
            System.out.println("cat, dog, hamster, horse, camel, donkey");
            System.out.println("Введите тип животного: ");
            String type = View.scanner.nextLine();
            String validateType = validator.verifyTypeFormat(type);
            if (!type.equals(validateType)) {
                throw new RuntimeException();
            }

            System.out.println("Введите дату рождения животного в формате гггг-мм-дд ");
            System.out.println("или введите 0, если дата рождения неизвестна: ");
            String birthDate = View.scanner.nextLine();
            String validateDate;
            if (birthDate.equals("0")) {
                validateDate = "неизвестно";
            } else {
                validateDate = validator.verifyDateFormat(birthDate);
            }
            if (!validateDate.equals(birthDate) && !validateDate.equals("неизвестно")) {
                throw new RuntimeException();
            }

            if (type.equals("cat")) {
                Cat cat = new Cat(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(cat);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }
            if (type.equals("dog")) {
                Dog dog = new Dog(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(dog);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }
            if (type.equals("hamster")) {
                Hamster hamster = new Hamster(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(hamster);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }
            if (type.equals("horse")) {
                Horse horse = new Horse(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(horse);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }
            if (type.equals("camel")) {
                Camel camel = new Camel(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(camel);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }
            if (type.equals("donkey")) {
                Donkey donkey = new Donkey(animalsList.size() + 1, name, validateType, validateDate);
                animalsList.add(donkey);
                System.out.println("Новое животное успешно добавлено в питомник!");
                isAddAnimal = true;
            }

        } catch (RuntimeException e) {
            System.out.println("Животное с такими данными не может быть заведено!");
            isAddAnimal = false;
        }        
        System.out.println(animalsList);
    }
    
    /**
     * Метод для поиска животного в питомнике и добавления ему команды.
     */
    public void addCommand() {

        System.out.println("Выберите животного, введите имя: ");
        String name = View.scanner.nextLine();
        int count = 0;
        for (int index = 0; index < animalsList.size(); index++) {
            if (animalsList.get(index).getName().equals(name)) {
                count++;
                System.out.println("Введите команду для изучения: ");
                String command = View.scanner.nextLine();
                animalsList.get(index).learnCommand(command);
            }       
        }
        if (count == 0) {
                System.out.println("Таких животных нет в питомнике!");
            }

    }

    /**
     * Метод для поиска животного в питомнике и просмотра его изученных команд.
     */
    public void showCommands() {

        System.out.println("Выберите животного, введите имя: ");
        String name = View.scanner.nextLine();
        int count = 0;
        for (int index = 0; index < animalsList.size(); index++) {
            if (animalsList.get(index).getName().equals(name)) {
                count++;
                if (animalsList.get(index).currentCommands.isEmpty()) {
                    System.out.println(animalsList.get(index).getName() + " пока не выучел(а) ни одной каманды. Сначала нужно научить!");
                } else {
                    System.out.println(animalsList.get(index).getName() + " умеет делать: " + animalsList.get(index).currentCommands);
                }
            }       
        }
        if (count == 0) {
                System.out.println("Таких животных нет в питомнике!");
            }
    }

    /**
     * Метод для поиска животного в питомнике, чтобы его погладить.
     */
    public void toPetAnimal() {

        System.out.println("Выберите животного, введите имя: ");
        String name = View.scanner.nextLine();
        int count = 0;
        for (int index = 0; index < animalsList.size(); index++) {
            if (animalsList.get(index).getName().equals(name)) {
                count++;
                animalsList.get(index).toPet();
            }       
        }
        if (count == 0) {
                System.out.println("Таких животных нет в питомнике!");
            }
    }

    /**
     * Метод для поиска животного в питомнике и выполнения его команды.
     */
    public void useAnimalCommand() {

        System.out.println("Выберите животного, введите имя: ");
        String name = View.scanner.nextLine();
        int count = 0;
        for (int index = 0; index < animalsList.size(); index++) {
            if (animalsList.get(index).getName().equals(name)) {
                count++;
                System.out.println("Введите команду для выполнения: ");
                String command = View.scanner.nextLine();
                animalsList.get(index).useCommand(command);
            }       
        }
        if (count == 0) {
                System.out.println("Таких животных нет в питомнике!");
            }
    }


}
    

