import java.util.Scanner;
/**
 * Класс для работы с меню
 */
public class View {

    protected Creator creator = new Creator();
    public static Scanner scanner = new Scanner(System.in);
    
    /**
     * Запуск меню
     */
    public void run(){

        try (Counter counter = new Counter()) {
         
            boolean f = true;
            while(f){
                System.out.println("Введите номер действия:");
                System.out.println("1 - Добавление нового животного");
                System.out.println("2 - Список команд животного");
                System.out.println("3 - Обучение новым командам");
                System.out.println("4 - Выполнить команду");
                System.out.println("5 - Погладить животного");
                System.out.println("6 - Счетчик животных");
                System.out.println("0 - Завершение работы приложения");
                String number = scanner.nextLine();

                switch(number){
                    case "1":
                        creator.add();
                        if (creator.isAddAnimal) {
                            counter.addCount();
                        }
                        f = askToContinue();
                        break;

                    case "2":
                        creator.showCommands();
                        f = askToContinue();
                        break;

                    case "3":
                        creator.addCommand();
                        f = askToContinue();    
                        break;
                
                    case "4":
                        creator.useAnimalCommand();
                        f = askToContinue();    
                        break;

                    case "5":
                        creator.toPetAnimal();
                        f = askToContinue();    
                        break;

                    case "6":
                        System.out.println(counter.toString());
                        f = askToContinue();    
                        break;

                    case "0":
                        System.out.println("Завершение работы приложения...");
                        f = false;
                        break;
                
                    default:
                        System.out.println("\nВы указали некорректный номер задачи!\nПовторите попытку ввода:");
                    break;

                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**Подменю. Продолжаем работу или выходим из приложения.
     * @return
     */
    public boolean askToContinue(){

        System.out.println("Продолжить работу с приложением? ");
        System.out.println("1 - продолжить работу");
        System.out.println("2 - выход из приложения");
        boolean f1 = true;
        while (f1) {
            String text = scanner.nextLine();
            switch(text){                        
                case "1":
                    f1 = false;                    
                    return true;

                case "2":
                    System.out.println("Завершение работы приложения...");
                    f1 = false;
                    return false;

                default:
                    System.out.println("Вы указали некорректный номер задачи!\nПовторите попытку ввода.");
                    break;
            }
        }
        return true;
    }

}
