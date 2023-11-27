import java.util.Random;

public class Producer implements Runnable{
    private TJTLModel model;

    public Producer(TJTLModel model){
        this.model = model;
    }

    @Override
    public void run() {
        for(int i=0; i<model.getParameters().getQuantityItemsP(); i++){
            if (this.model.getParameters().isReset()){
                Thread.currentThread().interrupt();
            }

            if (!this.model.getParameters().isRunning()){
                while (!this.model.getParameters().isRunning()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }

            model.getController().getProduct().increase();
            this.model.getResults().sumProduit();

            if (this.model.getParameters().isTempsMaximCheckBoxP()){
                try{
                    Thread.sleep(model.getParameters().getTempsMaximP());
                } catch (InterruptedException e) {
                }
            }else {
                Random random = new Random();
                int randomNumber = random.nextInt(98)+10;
                try{
                    Thread.sleep(randomNumber);
                } catch (InterruptedException e) {
                }
            }

        }
        this.model.getResults().resProductorProcesando();
        this.model.getResults().sumProductorFinalizado();
        this.model.getResults().resProductorPendiente();
    }
}
