public class TJTLModel{
    private TJTLController controller;
    private DTOLabParameters parameters;
    private DTOLabResults results;

    public TJTLModel(TJTLController controller) {
        this.controller = controller;
        this.results = new DTOLabResults();
        applyConfig();
    }

    public void play(){
        Thread threadProductores = new Thread(this::runProductores);
        Thread threadConsumidores = new Thread(this::runConsumidores);

        threadProductores.start();
        threadConsumidores.start();
    }

    public void runProductores(){
        for (int i=0; i<parameters.getProductores();i++){
            if (this.parameters.isReset()){
                break;
            }

            if (!parameters.isRunning()){
                while (!parameters.isRunning()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }

            Producer producer = new Producer(this);
            Thread thread = new Thread(producer);
            thread.start();
            this.results.sumProductorProcesando();
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

    public void runConsumidores(){
        for (int i=0; i<parameters.getConsumidores();i++){
            if (this.parameters.isReset()){
                break;
            }

            if (!parameters.isRunning()){
                while (!parameters.isRunning()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }

            this.results.sumConsumidorProcesando();
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            Consumer consumer = new Consumer(this);
            Thread thread = new Thread(consumer);
            thread.start();
        }
    }

    public void applyConfig(){
        this.parameters = this.controller.getLabParameters();
        this.results.setQuantityProduit(0);
        this.results.setQuantityConsumit(0);
        this.results.setQuantityProductorPendientes(parameters.getProductores());
        this.results.setQuantityProductorProcesando(0);
        this.results.setQuantityProductorFinalizados(0);
        this.results.setQuantityConsumidorPendientes(parameters.getConsumidores());
        this.results.setQuantityConsumidorProcesando(0);
        this.results.setQuantityConsumidorFinalizados(0);
    }

    public TJTLController getController() {
        return controller;
    }

    public void setController(TJTLController controller) {
        this.controller = controller;
    }

    public DTOLabParameters getParameters() {
        return parameters;
    }

    public void setParameters(DTOLabParameters parameters) {
        this.parameters = parameters;
    }

    public DTOLabResults getResults() {
        return results;
    }

    public void setResults(DTOLabResults results) {
        this.results = results;
    }
}
