package ThreadExamplesUsingRunnable;





class A implements Runnable{

    Counter count;

    public A(Counter count){
        this.count =count;
    }

    public void run(){

        for(int i =0;i<5000;i++) {
            //System.out.println("Hi");
            count.increment();
        }
    }
}






