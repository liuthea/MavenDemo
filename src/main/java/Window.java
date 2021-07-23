public class Window implements Runnable{
    public int ticket=100;
    public void run(){
        while(true) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "ticket number" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Window w = new Window();
        Thread t1=new Thread(w,"window1");//这些thread干同一件事
        Thread t2=new Thread(w,"window2");
        Thread t3=new Thread(w,"window3");
        t1.start();
        t2.start();
        t3.start();
    }
}
