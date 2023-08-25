public class Company {
    int n;
    boolean flag =  false;
    // false will trigger the producer
    //true will trigger the consumer
   synchronized public void produceItem(int n){
       if(flag){
           try {
               wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        this.n=n;
        System.out.println("Produced : "+this.n);
        flag = true;
        notify();
    }

   synchronized public int consumeItem(){
       if(!flag) {
           try {
               wait();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        System.out.println("Consumed : "+this.n);
       flag=true;
       notify();
        return this.n;
    }
}
