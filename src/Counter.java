import java.io.Closeable;
/**
 * Класс для подсчета животных в питомнике.
 */
public class Counter implements Closeable {

    protected Integer count = 0;

    public void addCount() {
        this.count++;
    }

    @Override
    public void close() {
       this.count = null;        
    }

    @Override
    public String toString() {
        return "Количество животных в питомнике: " + count;
    }    
}
