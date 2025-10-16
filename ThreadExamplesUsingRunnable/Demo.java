package ThreadExamplesUsingRunnable;

class Counter{
    int count;
    public  synchronized void increment(){

        count++;

        System.out.println(count);
    }

}

class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter sharedcounter = new Counter();
       Runnable obj1 = new A(sharedcounter);
        Runnable obj2 = new B(sharedcounter);

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);



        //t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();

          t1.join();
t2.join();

        System.out.println("Final count: " + sharedcounter.count);



    }
}