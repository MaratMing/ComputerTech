package LabWork9;

public class RUN implements Runnable {

    public void run() {
        for (int i = 0; i < 100; i++)
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public static void main(String[] aga) {
        RUN thread = new RUN();
        for (int i = 0; i < 3; i++)
            new Thread(thread).start();
    }
}
