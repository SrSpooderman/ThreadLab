public class TJTLController {
    private TJTLVista viewer;
    private TJTLModel model;
    private Product product;
    private DTOLabParameters labParameters;
    private DTOLabResults labResults;

    public TJTLController(){
        this.labParameters = new DTOLabParameters(
                200,
                100,
                true,
                100,
                400,
                100,
                true,
                100
        );

        this.model = new TJTLModel(this);
        this.viewer = new TJTLVista(this);
        this.product = new Product();
    }

    public void play(){
        model.play();
    }

    public TJTLVista getViewer() {
        return viewer;
    }

    public void setViewer(TJTLVista viewer) {
        this.viewer = viewer;
    }

    public TJTLModel getModel() {
        return model;
    }

    public void setModel(TJTLModel model) {
        this.model = model;
    }

    public DTOLabParameters getLabParameters() {
        return labParameters;
    }

    public void setLabParameters(DTOLabParameters labParameters) {
        this.labParameters = labParameters;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public DTOLabResults getLabResults() {
        return labResults;
    }

    public void setLabResults(DTOLabResults labResults) {
        this.labResults = labResults;
    }
}
