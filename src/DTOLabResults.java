import javax.swing.*;

public class DTOLabResults {
    private String msCrearThread;
    private String msArrancarThread;
    private String msProcesoConsumidor;
    private String msProcesoProductor;
    private Integer quantityProduit;
    private Integer quantityConsumit;
    private Integer quantityProductorProcesando;
    private Integer quantityProductorFinalizados;
    private Integer quantityProductorPendientes;
    private Integer quantityConsumidorProcesando;
    private Integer quantityConsumidorFinalizados;
    private Integer quantityConsumidorPendientes;

    public DTOLabResults() {
        quantityProductorProcesando = 0;
        quantityConsumidorProcesando = 0;
        quantityProduit = 0;
        quantityConsumit = 0;
        quantityProductorFinalizados = 0;
        quantityConsumidorFinalizados = 0;
    }

    public void resProductorPendiente(){
        quantityProductorPendientes--;
    }

    public void resConsumidorPendiente(){
        quantityConsumidorPendientes--;
    }

    public void sumProductorFinalizado(){
        quantityProductorFinalizados++;
    }

    public void sumConsumidorFinalizado(){
        quantityConsumidorFinalizados++;
    }

    public void sumProduit(){
        quantityProduit++;
    }

    public void sumConsumit(){
        quantityConsumit++;
    }

    public void sumProductorProcesando(){
        this.quantityProductorProcesando++;
    }

    public void resProductorProcesando(){
        this.quantityProductorProcesando--;
    }

    public void sumConsumidorProcesando(){
        this.quantityConsumidorProcesando++;
    }

    public void resConsumidorProcesando(){
        this.quantityConsumidorProcesando--;
    }

    public void setQuantityProductorPendientes(Integer quantityProductorPendientes) {
        this.quantityProductorPendientes = quantityProductorPendientes;
    }

    public void setQuantityConsumidorPendientes(Integer quantityConsumidorPendientes) {
        this.quantityConsumidorPendientes = quantityConsumidorPendientes;
    }

    public String getMsCrearThread() {
        return msCrearThread;
    }

    public String getMsArrancarThread() {
        return msArrancarThread;
    }

    public String getMsProcesoConsumidor() {
        return msProcesoConsumidor;
    }

    public String getMsProcesoProductor() {
        return msProcesoProductor;
    }

    public Integer getQuantityProduit() {
        return quantityProduit;
    }

    public Integer getQuantityConsumit() {
        return quantityConsumit;
    }

    public Integer getQuantityProductorProcesando() {
        return quantityProductorProcesando;
    }

    public Integer getQuantityProductorFinalizados() {
        return quantityProductorFinalizados;
    }

    public Integer getQuantityProductorPendientes() {
        return quantityProductorPendientes;
    }

    public Integer getQuantityConsumidorProcesando() {
        return quantityConsumidorProcesando;
    }

    public Integer getQuantityConsumidorFinalizados() {
        return quantityConsumidorFinalizados;
    }

    public Integer getQuantityConsumidorPendientes() {
        return quantityConsumidorPendientes;
    }

    public void setQuantityProduit(Integer quantityProduit) {
        this.quantityProduit = quantityProduit;
    }

    public void setQuantityConsumit(Integer quantityConsumit) {
        this.quantityConsumit = quantityConsumit;
    }

    public void setQuantityProductorProcesando(Integer quantityProductorProcesando) {
        this.quantityProductorProcesando = quantityProductorProcesando;
    }

    public void setQuantityProductorFinalizados(Integer quantityProductorFinalizados) {
        this.quantityProductorFinalizados = quantityProductorFinalizados;
    }

    public void setQuantityConsumidorProcesando(Integer quantityConsumidorProcesando) {
        this.quantityConsumidorProcesando = quantityConsumidorProcesando;
    }

    public void setQuantityConsumidorFinalizados(Integer quantityConsumidorFinalizados) {
        this.quantityConsumidorFinalizados = quantityConsumidorFinalizados;
    }
}
