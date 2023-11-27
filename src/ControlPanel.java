import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel{
    private JToggleButton playPause;
    private JButton start;
    private JButton apply;
    private JButton reset;
    private JCheckBox protectCriticalRegions;
    private JCheckBox preventNegativeStocks;

    public ControlPanel(){
        this.playPause = new JToggleButton("Play");
        this.apply = new JButton("Apply");
        this.reset = new JButton("Reset");
        this.start = new JButton("Start");
        this.protectCriticalRegions = new JCheckBox("CriticalRegions");
        this.protectCriticalRegions.setActionCommand("CriticalRegions");

        this.preventNegativeStocks = new JCheckBox("NegativeStocks");
        this.preventNegativeStocks.setActionCommand("NegativeStocks");
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

        start.setForeground(colorText);
        this.add(this.start,c);c.gridy++;

        playPause.setForeground(colorText);
        this.add(this.playPause, c);c.gridy++;

        apply.setForeground(colorText);
        this.add(this.apply,c);c.gridy++;

        reset.setForeground(colorText);
        this.add(this.reset,c);c.gridy++;

        JLabel label1 = new JLabel("Prevenir Negativos");
        label1.setForeground(colorText);
        this.add(label1,c);c.gridy++;
        preventNegativeStocks.setForeground(colorText);
        this.add(this.preventNegativeStocks, c);c.gridy++;

        JLabel label2 = new JLabel("Proteger Regiones Criticas");
        label2.setForeground(colorText);
        this.add(label2,c);c.gridy++;
        protectCriticalRegions.setForeground(colorText);
        this.add(this.protectCriticalRegions,c);c.gridy++;
    }

    public JToggleButton getPlayPause() {
        return playPause;
    }

    public void setPlayPause(JToggleButton playPause) {
        this.playPause = playPause;
    }

    public JButton getApply() {
        return apply;
    }

    public void setApply(JButton apply) {
        this.apply = apply;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public JCheckBox getProtectCriticalRegions() {
        return protectCriticalRegions;
    }

    public void setProtectCriticalRegions(JCheckBox protectCriticalRegions) {
        this.protectCriticalRegions = protectCriticalRegions;
    }

    public JCheckBox getPreventNegativeStocks() {
        return preventNegativeStocks;
    }

    public void setPreventNegativeStocks(JCheckBox preventNegativeStocks) {
        this.preventNegativeStocks = preventNegativeStocks;
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }
}
