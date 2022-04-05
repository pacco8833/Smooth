import java.util.Random;

public class ThreadBlocker {
    public static void main(String[] args) {

        //classes which update a name and a number after waiting for a while for the random # to generate.

        SillyClass
         t1 = new SillyClass(),
         t2 = new SillyClass();

        new Thread(new Runnable() {
            public void run() {
                t1.changeRandomName();
                t1.changeRandomNum();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                t2.changeRandomNum();
                t2.changeRandomName();
            }
        }).start();
    }

}

class SillyClass {

    //the number and name to be affected by the methods
    int num = 0;
    String name = "Carl";

//changes the number
    public synchronized void changeRandomNum() {
       
        Random rand = new Random();
        try {
            //wait 4 seconds
            Thread.sleep(4000);
            num = rand.nextInt(100);
        } catch (Exception e) {
            System.out.println("Exception encountered");
            num = rand.nextInt(100);
        } finally {
            System.out.println("Random number changed to : " + num);

        }
    }
//Changes the name
    public synchronized void changeRandomName() {

        name = (name == "Carl") ? "Amanda" : "Carl";
        System.out.println("Name has been updated to : " + name);
    }
}