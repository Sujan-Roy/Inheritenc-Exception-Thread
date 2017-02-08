package Thread;

/**
 * Created by Android on 2/8/2017.
 */
public class MainThread {
    public static void main(String args[]) {
        Mthread R1 = new Mthread( "Thread-1");
        R1.start();

        Mthread R2 = new Mthread( "Thread-2");
        R2.start();
    }
}
