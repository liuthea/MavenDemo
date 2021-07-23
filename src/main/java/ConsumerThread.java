public class ConsumerThread{

    public static void main (String[] args) throws InterruptedException{
        Buffer buffer = new Buffer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.pop();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.push();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        //t1.join();
        //t2.join();
    }


}