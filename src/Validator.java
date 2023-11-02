/**
 * Класс для проверки на валидность данных.
 */
public class Validator {
    

    /**Метод возвращает исходный текст при условии правильного заполнения. Для типа жовотного.
     * @param text
     * @return
     */
    public String verifyTypeFormat(String text) {

        String resultText = "";
        try {
            if (!isValidType(text)) {
                throw new CategoryExeption();
            } else {
                resultText = text;
            }
        } catch (RuntimeException e) {
            System.out.println(e);
        }
        return resultText;
    }

    /**Метод проверяет правильность заполнения данных. Для типа жовотного.
     * @param text
     * @return
     */
    public boolean isValidType(String text) {

        if (text.equals("cat") || text.equals("dog") || text.equals("hamster") || text.equals("horse") || text.equals("camel") || text.equals("donkey")) {
            return true;
        } else {
            return false;
        }
    }

    /**Метод возвращает исходный текст при условии правильного заполнения. Для даты рождения.
     * @param text
     * @return
     */
    public String verifyDateFormat(String text) {

        String resultText = "";
        try {
            String []dateArray = text.split("-");
            if (dateArray.length != 3) {
                throw new QuantityDateExeption();
            }
            
            int day = Integer.parseInt(dateArray[2]);
            int month = Integer.parseInt(dateArray[1]);
            int year = Integer.parseInt(dateArray[0]);
            
            if (isValidDateNumbers(day, month, year) == false) {
                throw new InvalidDateFormatExeption();
            }
            StringBuilder textBuild = new StringBuilder();       
            textBuild = textBuild.append(dateArray[0]).append("-").append(dateArray[1]).append("-").append(dateArray[2]);
            resultText = textBuild.toString();

        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ввода чисел даты!");
        } catch (RuntimeException e) {
            System.out.println(e);
        }

        return resultText;
    }

    /**Метод проверяет правильность заполнения данных. Для даты рождения.
     * @param day
     * @param month
     * @param year
     * @return
     */
    public boolean isValidDateNumbers (int day, int month, int year) {
        if ((day<1 || day>31) || (month<1 || month>12) || (year<1983 || year>2023)) {
            return false;
        } else {
            if (day == 31 && (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)) {
                return false;
            } else {
                if (day == 30 && month == 2) {
                    return false;
                } else {
                   if ((day == 29) && (month == 2) && (year %4 != 0)) {
                    return false;
                   } else {
                    return true;
                   }
                }
                
            }
            
        }
    }
}
