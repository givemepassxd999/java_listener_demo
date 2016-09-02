import java.util.concurrent.Executors;

/**
 * Created by rick.wu on 2016/9/2.
 */
public class Main {
    public static void main(String[] args) {
        A a = new A();
        final B b = new B(a);
        //A的任務
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                a.handleLongTask();
            }
        });
        //B的任務
        Executors.newSingleThreadExecutor().submit(new Runnable() {
            @Override
            public void run() {
                b.handleEvent();
            }
        });
    }
}
