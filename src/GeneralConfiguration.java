import javax.swing.*;
import java.awt.*;

public class GeneralConfiguration extends JPanel {
    private JTextField productores;
    private JTextField quantityItemsP;
    private JCheckBox tempsMaximCheckBoxP;
    private JTextField tempsMaximP;
    private JTextField consumidores;
    private JTextField quantityItemsC;
    private JCheckBox tempsMaximCheckBoxC;
    private JTextField tempsMaximC;

    public GeneralConfiguration(){
        this.productores = new JTextField("Cantidad de productores");
        this.quantityItemsP = new JTextField("Cantidad de items");
        this.tempsMaximCheckBoxP = new JCheckBox();
        this.tempsMaximP = new JTextField("Tiempo maximo");
        this.consumidores = new JTextField("Cantidad de consumidres");
        this.quantityItemsC = new JTextField("Cantidad de items");
        this.tempsMaximCheckBoxC = new JCheckBox();
        this.tempsMaximC = new JTextField("Tiempo maximo");
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

        c.insets = new java.awt.Insets(0, 0, 5, 0);
        JLabel label1 = new JLabel("Productores");
        label1.setForeground(new Color(0x776B5D));
        this.add(label1,c);c.gridy++;
        c.insets = new java.awt.Insets(0, 0, 0, 0);

        JLabel label2 = new JLabel("Cantidad de productores");
        label2.setForeground(colorText);
        this.add(label2,c);c.gridy++;
        productores.setForeground(colorText);
        this.add(productores,c);c.gridy++;

        JLabel label3 = new JLabel("Items por productor");
        label3.setForeground(colorText);
        this.add(label3,c);c.gridy++;
        quantityItemsP.setForeground(colorText);
        this.add(quantityItemsP,c);c.gridy++;

        JLabel label4 = new JLabel("Maximo o aleatorio");
        label4.setForeground(colorText);
        this.add(label4,c);c.gridy++;
        tempsMaximP.setForeground(colorText);
        this.add(tempsMaximCheckBoxP,c);c.gridy++;
        this.add(tempsMaximP,c);c.gridy++;


        c.insets = new java.awt.Insets(10, 0, 5, 0);
        JLabel label5 = new JLabel("Consumidores");
        label5.setForeground(new Color(0x776B5D));
        this.add(label5,c);c.gridy++;
        c.insets = new java.awt.Insets(0, 0, 0, 0);

        JLabel label6 = new JLabel("Cantidad de consumidores");
        label6.setForeground(colorText);
        this.add(label6,c);c.gridy++;
        consumidores.setForeground(colorText);
        this.add(consumidores,c);c.gridy++;

        JLabel label7 = new JLabel("Items por consumidor");
        label7.setForeground(colorText);
        this.add(label7,c);c.gridy++;
        quantityItemsC.setForeground(colorText);
        this.add(quantityItemsC,c);c.gridy++;

        JLabel label8 = new JLabel("Maximo o aleatorio");
        label8.setForeground(colorText);
        this.add(label8,c);c.gridy++;
        tempsMaximC.setForeground(colorText);
        this.add(tempsMaximCheckBoxC,c);c.gridy++;
        this.add(tempsMaximC,c);c.gridy++;
    }

    public JTextField getProductores() {
        return productores;
    }

    public void setProductores(JTextField productores) {
        this.productores = productores;
    }

    public JTextField getQuantityItemsP() {
        return quantityItemsP;
    }

    public void setQuantityItemsP(JTextField quantityItemsP) {
        this.quantityItemsP = quantityItemsP;
    }

    public JCheckBox getTempsMaximCheckBoxP() {
        return tempsMaximCheckBoxP;
    }

    public void setTempsMaximCheckBoxP(JCheckBox tempsMaximCheckBoxP) {
        this.tempsMaximCheckBoxP = tempsMaximCheckBoxP;
    }

    public JTextField getTempsMaximP() {
        return tempsMaximP;
    }

    public void setTempsMaximP(JTextField tempsMaximP) {
        this.tempsMaximP = tempsMaximP;
    }

    public JTextField getConsumidores() {
        return consumidores;
    }

    public void setConsumidores(JTextField consumidores) {
        this.consumidores = consumidores;
    }

    public JTextField getQuantityItemsC() {
        return quantityItemsC;
    }

    public void setQuantityItemsC(JTextField quantityItemsC) {
        this.quantityItemsC = quantityItemsC;
    }

    public JCheckBox getTempsMaximCheckBoxC() {
        return tempsMaximCheckBoxC;
    }

    public void setTempsMaximCheckBoxC(JCheckBox tempsMaximCheckBoxC) {
        this.tempsMaximCheckBoxC = tempsMaximCheckBoxC;
    }

    public JTextField getTempsMaximC() {
        return tempsMaximC;
    }

    public void setTempsMaximC(JTextField tempsMaximC) {
        this.tempsMaximC = tempsMaximC;
    }
}
