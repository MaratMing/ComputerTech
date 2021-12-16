package LabWork9;

public class TRD extends Thread {
    StringBuilder a;

    public TRD(StringBuilder a) {
        this.a = a;
    }

    public void run() {
        synchronized (a) {
            for (int i = 0; i < 100; ++i)
                System.out.print(i + "" + a + "    ");
            System.out.println("\n");
            a.setCharAt(0, (char) (a.charAt(0) + 1));
        }
    }

    public static void main(String[] msi) {
        StringBuilder s = new StringBuilder("a");
        for (int i = 0; i < 3; i++)
            new TRD(s).start();
    }
}