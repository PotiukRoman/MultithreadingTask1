
public class MyThread extends Thread{
    private static int generalCount=1;
    private int threadCount;
    private int maxThread=50;

    public MyThread() throws InterruptedException {
        threadCount=generalCount;
        start();
    }

    @Override
    public void run() {
        if(generalCount<maxThread){
            generalCount++;
            try {
                new MyThread().join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Thread "+ threadCount +" created!");
    }
}