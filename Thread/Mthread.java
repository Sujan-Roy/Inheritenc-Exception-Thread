package Thread;

/**
 * Created by Android on 2/8/2017.
 */
public class Mthread implements Runnable {
    Thread t;
    String tname;
    Mthread(String name){
        tname=name;
        System.out.println("Number of " +tname);

    }
    @Override
    public void run() {
        System.out.println("Run of  " +tname);
        try{
            for(int i=0;i<5;i++)
                System.out.println(" "+tname + ","+i);
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread " +  tname + " interrupted");
        }
        //System.out.println("Thread" +tname +"Exit");
    }

    public void start () {
        System.out.println("Starting " +  tname );
        if (t == null) {
            t = new Thread (this, tname);
            t.start ();
        }
    }
}
