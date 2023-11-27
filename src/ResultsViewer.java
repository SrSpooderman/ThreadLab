import javax.swing.*;
import java.awt.*;

public class ResultsViewer extends JPanel {
    private JTextField msCrearThread;
    private JTextField msArrancarThread;
    private JTextField msProcesoConsumidor;
    private JTextField msProcesoProductor;
    private JTextField quantityProduit;
    private JTextField quantityConsumit;
    private JTextField quantityProductorProcesando;
    private JTextField quantityProductorFinalizados;
    private JTextField quantityProductorPendientes;
    private JTextField quantityConsumidorProcesando;
    private JTextField quantityConsumidorFinalizados;
    private JTextField quantityConsumidorPendientes;

    public ResultsViewer() {
        this.msCrearThread = new JTextField("Esperando datos");
        this.msArrancarThread = new JTextField("Esperando datos");
        this.msProcesoConsumidor = new JTextField("Esperando datos");
        this.msProcesoProductor = new JTextField("Esperando datos");
        this.quantityProduit = new JTextField("Esperando datos");
        this.quantityConsumit = new JTextField("Esperando datos");
        this.quantityProductorProcesando = new JTextField("Esperando datos");
        this.quantityProductorFinalizados = new JTextField("Esperando datos");
        this.quantityProductorPendientes = new JTextField("Esperando datos");
        this.quantityConsumidorProcesando = new JTextField("Esperando datos");
        this.quantityConsumidorFinalizados = new JTextField("Esperando datos");
        this.quantityConsumidorPendientes = new JTextField("Esperando datos");
        addComponentsToPane();
    }

    private void addComponentsToPane(){
        Color colorText = new Color(0xB0A695);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.NORTHWEST;
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0;

        JLabel label1 = new JLabel("Milisegundos en crear hilos");
        label1.setForeground(colorText);
        this.add(label1,c);c.gridy++;
        msCrearThread.setForeground(colorText);
        this.add(this.msCrearThread,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label2 = new JLabel("Milisegundos en arracanr hilos");
        label2.setForeground(colorText);
        this.add(label2,c);c.gridy++;
        msArrancarThread.setForeground(colorText);
        this.add(this.msArrancarThread,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label3 = new JLabel("Milisegundos en procesar consumidores");
        label3.setForeground(colorText);
        this.add(label3,c);c.gridy++;
        msProcesoConsumidor.setForeground(colorText);
        this.add(this.msProcesoConsumidor,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label4 = new JLabel("Milisegundos en procesar productores");
        label4.setForeground(colorText);
        this.add(label4,c);c.gridy++;
        msProcesoProductor.setForeground(colorText);
        this.add(this.msProcesoProductor,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label5 = new JLabel("Cantidad de items producidos");
        label5.setForeground(colorText);
        this.add(label5,c);c.gridy++;
        quantityProduit.setForeground(colorText);
        this.add(this.quantityProduit,c );c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label6 = new JLabel("Cantidad de items consumidos");
        label6.setForeground(colorText);
        this.add(label6,c);c.gridy++;
        quantityConsumit.setForeground(colorText);
        this.add(this.quantityConsumit,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label7 = new JLabel("Productores procesandos");
        label7.setForeground(colorText);
        this.add(label7,c);c.gridy++;
        quantityProductorProcesando.setForeground(colorText);
        this.add(this.quantityProductorProcesando,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label8 = new JLabel("Productores finalizados");
        label8.setForeground(colorText);
        this.add(label8,c);c.gridy++;
        quantityProductorFinalizados.setForeground(colorText);
        this.add(this.quantityProductorFinalizados,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label9 = new JLabel("Productores pendientes");
        label9.setForeground(colorText);
        this.add(label9,c);c.gridy++;
        quantityProductorPendientes.setForeground(colorText);
        this.add(this.quantityProductorPendientes,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label10 = new JLabel("Consumidores procesandos");
        label10.setForeground(colorText);
        this.add(label10,c);c.gridy++;
        quantityConsumidorProcesando.setForeground(colorText);
        this.add(this.quantityConsumidorProcesando,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label11 = new JLabel("Consumidores finalizados");
        label11.setForeground(colorText);
        this.add(label11,c);c.gridy++;
        quantityConsumidorFinalizados.setForeground(colorText);
        this.add(this.quantityConsumidorFinalizados,c);c.gridy++;
        this.add(Box.createVerticalStrut(10), c);c.gridy++;

        JLabel label12 = new JLabel("Consumidores pendientes");
        label12.setForeground(colorText);
        this.add(label12,c);c.gridy++;
        quantityConsumidorPendientes.setForeground(colorText);
        this.add(this.quantityConsumidorPendientes,c);c.gridy++;
    }

    public void setVoid(){
        this.msCrearThread.setText("Esperando datos");
        this.msArrancarThread.setText("Esperando datos");
        this.msProcesoConsumidor.setText("Esperando datos");
        this.msProcesoProductor.setText("Esperando datos");
        this.quantityProduit.setText("Esperando datos");
        this.quantityConsumit.setText("Esperando datos");
        this.quantityProductorProcesando.setText("Esperando datos");
        this.quantityProductorFinalizados.setText("Esperando datos");
        this.quantityProductorPendientes.setText("Esperando datos");
        this.quantityConsumidorProcesando.setText("Esperando datos");
        this.quantityConsumidorFinalizados.setText("Esperando datos");
        this.quantityConsumidorPendientes.setText("Esperando datos");
    }
    public JTextField getMsCrearThread() {
        return msCrearThread;
    }

    public void setMsCrearThread(JTextField msCrearThread) {
        this.msCrearThread = msCrearThread;
    }

    public JTextField getMsArrancarThread() {
        return msArrancarThread;
    }

    public void setMsArrancarThread(JTextField msArrancarThread) {
        this.msArrancarThread = msArrancarThread;
    }

    public JTextField getMsProcesoConsumidor() {
        return msProcesoConsumidor;
    }

    public void setMsProcesoConsumidor(JTextField msProcesoConsumidor) {
        this.msProcesoConsumidor = msProcesoConsumidor;
    }

    public JTextField getMsProcesoProductor() {
        return msProcesoProductor;
    }

    public void setMsProcesoProductor(JTextField msProcesoProductor) {
        this.msProcesoProductor = msProcesoProductor;
    }

    public JTextField getQuantityProduit() {
        return quantityProduit;
    }

    public void setQuantityProduit(JTextField quantityProduit) {
        this.quantityProduit = quantityProduit;
    }

    public JTextField getQuantityConsumit() {
        return quantityConsumit;
    }

    public void setQuantityConsumit(JTextField quantityConsumit) {
        this.quantityConsumit = quantityConsumit;
    }

    public JTextField getQuantityProductorProcesando() {
        return quantityProductorProcesando;
    }

    public void setQuantityProductorProcesando(JTextField quantityProductorProcesando) {
        this.quantityProductorProcesando = quantityProductorProcesando;
    }

    public JTextField getQuantityProductorFinalizados() {
        return quantityProductorFinalizados;
    }

    public void setQuantityProductorFinalizados(JTextField quantityProductorFinalizados) {
        this.quantityProductorFinalizados = quantityProductorFinalizados;
    }

    public JTextField getQuantityProductorPendientes() {
        return quantityProductorPendientes;
    }

    public void setQuantityProductorPendientes(JTextField quantityProductorPendientes) {
        this.quantityProductorPendientes = quantityProductorPendientes;
    }

    public JTextField getQuantityConsumidorProcesando() {
        return quantityConsumidorProcesando;
    }

    public void setQuantityConsumidorProcesando(JTextField quantityConsumidorProcesando) {
        this.quantityConsumidorProcesando = quantityConsumidorProcesando;
    }

    public JTextField getQuantityConsumidorFinalizados() {
        return quantityConsumidorFinalizados;
    }

    public void setQuantityConsumidorFinalizados(JTextField quantityConsumidorFinalizados) {
        this.quantityConsumidorFinalizados = quantityConsumidorFinalizados;
    }

    public JTextField getQuantityConsumidorPendientes() {
        return quantityConsumidorPendientes;
    }

    public void setQuantityConsumidorPendientes(JTextField quantityConsumidorPendientes) {
        this.quantityConsumidorPendientes = quantityConsumidorPendientes;
    }
}
