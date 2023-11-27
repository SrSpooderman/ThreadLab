public class DTOLabParameters {
    private Integer productores;
    private Integer quantityItemsP;
    private boolean tempsMaximCheckBoxP;
    private Integer tempsMaximP;
    private Integer consumidores;
    private Integer quantityItemsC;
    private boolean tempsMaximCheckBoxC;
    private Integer tempsMaximC;
    private boolean reset;
    private boolean running;

    public DTOLabParameters(Integer productores, Integer quantityItemsP, boolean tempsMaximCheckBoxP, Integer tempsMaximP, Integer consumidores, Integer quantityItemsC, boolean tempsMaximCheckBoxC, Integer tempsMaximC) {
        this.productores = productores;
        this.quantityItemsP = quantityItemsP;
        this.tempsMaximCheckBoxP = tempsMaximCheckBoxP;
        this.tempsMaximP = tempsMaximP;
        this.consumidores = consumidores;
        this.quantityItemsC = quantityItemsC;
        this.tempsMaximCheckBoxC = tempsMaximCheckBoxC;
        this.tempsMaximC = tempsMaximC;
        this.reset = false;
        this.running = false;
    }

    public Integer getProductores() {
        return productores;
    }

    public void setProductores(Integer productores) {
        this.productores = productores;
    }

    public Integer getQuantityItemsP() {
        return quantityItemsP;
    }

    public void setQuantityItemsP(Integer quantityItemsP) {
        this.quantityItemsP = quantityItemsP;
    }

    public boolean isTempsMaximCheckBoxP() {
        return tempsMaximCheckBoxP;
    }

    public void setTempsMaximCheckBoxP(boolean tempsMaximCheckBoxP) {
        this.tempsMaximCheckBoxP = tempsMaximCheckBoxP;
    }

    public Integer getTempsMaximP() {
        return tempsMaximP;
    }

    public void setTempsMaximP(Integer tempsMaximP) {
        this.tempsMaximP = tempsMaximP;
    }

    public Integer getConsumidores() {
        return consumidores;
    }

    public void setConsumidores(Integer consumidores) {
        this.consumidores = consumidores;
    }

    public Integer getQuantityItemsC() {
        return quantityItemsC;
    }

    public void setQuantityItemsC(Integer quantityItemsC) {
        this.quantityItemsC = quantityItemsC;
    }

    public boolean isTempsMaximCheckBoxC() {
        return tempsMaximCheckBoxC;
    }

    public void setTempsMaximCheckBoxC(boolean tempsMaximCheckBoxC) {
        this.tempsMaximCheckBoxC = tempsMaximCheckBoxC;
    }

    public Integer getTempsMaximC() {
        return tempsMaximC;
    }

    public void setTempsMaximC(Integer tempsMaximC) {
        this.tempsMaximC = tempsMaximC;
    }

    public boolean isReset() {
        return reset;
    }

    public void setReset(boolean reset) {
        this.reset = reset;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean stop) {
        this.running = stop;
    }
}
