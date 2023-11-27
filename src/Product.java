public class Product extends ProtectedCounter{
    private boolean sync;
    private boolean pNeg;

    public Product(){
        super();
        sync = false;
        pNeg = false;
    }

    public void increase(){
        if (sync){
            inc_syncro();
        }else{
            inc();
        }
    }

    public void decrease(){
        if (sync && pNeg){
            dec_syncro_pNeg();
        }else if (sync){
            dec_syncro();
        }else {
            dec();
        }
    }

    public boolean isSync() {
        return sync;
    }

    public void setSync(boolean sync) {
        this.sync = sync;
    }

    public boolean ispNeg() {
        return pNeg;
    }

    public void setpNeg(boolean pNeg) {
        this.pNeg = pNeg;
    }
}

