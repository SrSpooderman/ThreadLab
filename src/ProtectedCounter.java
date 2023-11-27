public class ProtectedCounter {
    private int value;

    public ProtectedCounter(){
        value = 0;
    }

    public void inc(){
        value++;
    }

    public void dec(){
        value--;
    }

    public synchronized void inc_syncro(){
        value++;
        notify();
    }

    public synchronized void dec_syncro(){
        value--;
    }

    public synchronized void dec_syncro_pNeg(){
        while (value <= 0){
            try{
                wait();
            } catch (InterruptedException e) {
            }
        }
        value--;
    }

    public int getValue(){
        return value;
    }
}
