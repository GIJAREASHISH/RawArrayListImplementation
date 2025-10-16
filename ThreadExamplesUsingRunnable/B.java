package ThreadExamplesUsingRunnable;

class B implements Runnable{
    Counter count;

    public B(Counter count){

        this.count=count;
    }
    public void run(){

        for(int i =0;i<5000;i++) {
            //System.out.println("Hello");
            count.increment();
        }
    }


}
