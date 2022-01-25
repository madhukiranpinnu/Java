package MultiThreading;
class Display2 {
    public void wish(String name) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Happy Birthday :");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }

        }
    }

    static class Mythread12 extends Thread {
        Display2 d;
        String name;

        Mythread12(Display2 d, String name) {
            this.d = d;
            this.name = name;
        }

        public void run() {
            d.wish(name);
        }
    }

    public static class SnychronizedBlockdemo {
        public static void main(String args[]) {
            Display2 d11 = new Display2();
            Mythread12 mt = new Mythread12(d11, "madhu");
            mt.start();
            Mythread12 mt1 = new Mythread12(d11, "sai");
            mt1.start();

        }
    }
}
