import java.util.Random;

//package SmoothStack.DayFour;

public class ProdCon {
    // This class Produces ints.
    class Producer implements Runnable {

        int num = 0;

        public void run() {

            System.out.println("Production has begun");
            try {

                changeRandomNum();

            } catch (Exception e) {

                System.out.println(e + " needs to be handled more gracefully.");

            }
        }

        public int changeRandomNum() {

            Random rand = new Random(100);

            return num = rand.nextInt();
        }
    }

    // This Class uses ints provided by the consumer.
    class Consumer implements Runnable {

        int num = 0;

        public void run() {

            for (;;) {
                System.out.println("Attempting to consume: ");
                getRandomNum();
            }
        }

        private void getRandomNum() {

            Runnable p = new Producer();
            p.run();
        }
    }

    public static void main(String[] args) {

    }

}