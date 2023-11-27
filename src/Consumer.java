import java.util.Random;

public class Consumer implements Runnable{
    private TJTLModel model;

    public Consumer(TJTLModel model){
        this.model = model;
    }

    @Override
    public void run() {
        for(int i=0; i<model.getParameters().getQuantityItemsC(); i++){
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

            model.getController().getProduct().decrease();
            this.model.getResults().sumConsumit();

            if (this.model.getParameters().isTempsMaximCheckBoxC()){
                try{
                    Thread.sleep(model.getParameters().getTempsMaximC());
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
        this.model.getResults().resConsumidorProcesando();
        this.model.getResults().sumConsumidorFinalizado();
        this.model.getResults().resConsumidorPendiente();
    }
}
