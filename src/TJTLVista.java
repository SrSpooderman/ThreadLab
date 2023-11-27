import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class TJTLVista extends JFrame implements ActionListener, ChangeListener, Runnable, ComponentListener {
    private ControlPanel controlPanel;
    private ResultsViewer resultsViewer;
    private GeneralConfiguration generalConfiguration;
    private TJTLController controller;

    public TJTLVista(TJTLController controller){
        this.controller = controller;
        this.controlPanel = new ControlPanel();
        this.resultsViewer = new ResultsViewer();
        this.generalConfiguration = new GeneralConfiguration();
        this.buttonFunc();
        this.configureJFrame();
    }

    private void addComponentsToPane(Container panel){
        panel.setBackground(new Color(0xF3EEEA));
        GridBagConstraints c = new GridBagConstraints();
        c.anchor = GridBagConstraints.NORTHWEST;
        c.weightx = 1;
        c.weighty = 1;

        c.gridx = 0;
        c.gridy = 1;
        c.insets = new java.awt.Insets(5, 50, 5, 0);
        panel.add(controlPanel, c);

        c.gridx = 0;
        c.gridy = 2;
        panel.add(generalConfiguration, c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        panel.add(new JTextArea(),c);

        c.gridx = 2;
        c.gridy = 1;
        c.gridheight = 2;
        c.anchor = GridBagConstraints.NORTHEAST;
        c.fill = GridBagConstraints.NONE;
        c.insets = new java.awt.Insets(5, 50, 5, 50);
        panel.add(resultsViewer, c);

        c.gridx = 1;
        c.gridy = 0;
        c.gridheight = 1;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new java.awt.Insets(5, 50, 20, 0);
        Font titleFont = new Font("Arial", Font.BOLD, 50);
        JLabel tittleLabel = new  JLabel("ThreadLab");
        tittleLabel.setFont(titleFont);
        tittleLabel.setForeground(new Color(0x776B5D));
        panel.add(tittleLabel, c);
    }

    private void configureJFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());
        addComponentsToPane(this.getContentPane());
        setDefaultValues();
        this.addComponentListener(this);
        this.setSize(1000,1000);
        this.setVisible(true);
    }

    private void buttonFunc(){
        controlPanel.getPlayPause().addActionListener(this);
        controlPanel.getApply().addActionListener(this);
        controlPanel.getReset().addActionListener(this);
        controlPanel.getStart().addActionListener(this);
        controlPanel.getProtectCriticalRegions().addActionListener(this);
        controlPanel.getPreventNegativeStocks().addActionListener(this);
    }

    private void setDefaultValues(){
        this.generalConfiguration.getConsumidores().setText(String.valueOf(this.controller.getModel().getParameters().getConsumidores()));
        this.generalConfiguration.getProductores().setText(String.valueOf(this.controller.getModel().getParameters().getProductores()));
        this.generalConfiguration.getQuantityItemsC().setText(String.valueOf(this.controller.getModel().getParameters().getQuantityItemsC()));
        this.generalConfiguration.getQuantityItemsP().setText(String.valueOf(this.controller.getModel().getParameters().getQuantityItemsP()));
        this.generalConfiguration.getTempsMaximC().setText(String.valueOf(this.controller.getModel().getParameters().getTempsMaximC()));
        this.generalConfiguration.getTempsMaximP().setText(String.valueOf(this.controller.getModel().getParameters().getTempsMaximP()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();

        if (e.getSource() instanceof JCheckBox){
            JCheckBox checkBox = (JCheckBox) e.getSource();
            handleCheckBoxAction(checkBox, str);
        }else{
            switch (str){
                case "Start":
                    this.controller.getModel().getParameters().setRunning(true);
                    controlPanel.getPlayPause().setSelected(true);
                    controlPanel.getPlayPause().setText("Pause");
                    this.controller.play();
                    break;
                case "Play":
                    this.controller.getModel().getParameters().setRunning(true);
                    controlPanel.getPlayPause().setText("Pause");
                    break;
                case "Pause":
                    this.controller.getModel().getParameters().setRunning(false);
                    controlPanel.getPlayPause().setText("Play");
                    break;
                case "Apply":
                    this.controller.getModel().getParameters().setConsumidores(Integer.valueOf(this.generalConfiguration.getConsumidores().getText()));
                    this.controller.getModel().getParameters().setQuantityItemsC(Integer.valueOf(this.generalConfiguration.getQuantityItemsC().getText()));
                    this.controller.getModel().getParameters().setTempsMaximC(Integer.valueOf(this.generalConfiguration.getTempsMaximC().getText()));
                    this.controller.getModel().getParameters().setTempsMaximCheckBoxC(this.generalConfiguration.getTempsMaximCheckBoxC().isSelected());

                    this.controller.getModel().getParameters().setProductores(Integer.valueOf(this.generalConfiguration.getProductores().getText()));
                    this.controller.getModel().getParameters().setQuantityItemsP(Integer.valueOf(this.generalConfiguration.getQuantityItemsP().getText()));
                    this.controller.getModel().getParameters().setTempsMaximP(Integer.valueOf(this.generalConfiguration.getTempsMaximP().getText()));
                    this.controller.getModel().getParameters().setTempsMaximCheckBoxP(this.generalConfiguration.getTempsMaximCheckBoxP().isSelected());
                case "Reset":
                    this.controller.getModel().getParameters().setReset(true);
                    this.controller.getModel().getParameters().setRunning(true);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    this.controller.getModel().getParameters().setReset(false);
                    this.controller.getModel().getParameters().setRunning(false);
                    this.controller.getModel().applyConfig();
                    setDefaultValues();

                    this.controlPanel.getPlayPause().setSelected(false);
                    this.controller.getModel().getParameters().setRunning(false);
                    this.controlPanel.getPlayPause().setText("Play");
                    break;
                default:
                    System.err.println("Accion no tratada: "+e);
            }
        }
    }

    private void handleCheckBoxAction(JCheckBox checkBox, String actionCommand){
        switch (actionCommand) {
            case "CriticalRegions":
                this.controller.getProduct().setSync(checkBox.isSelected());
                break;
            case "NegativeStocks":
                this.controller.getProduct().setpNeg(checkBox.isSelected());
                break;
            default:
                System.err.println("Accion no tratada para checkbox: " + actionCommand);
        }
    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(100);
                this.resultsViewer.getQuantityProduit().setText(String.valueOf(this.controller.getModel().getResults().getQuantityProduit()));
                this.resultsViewer.getQuantityConsumit().setText(String.valueOf(this.controller.getModel().getResults().getQuantityConsumit()));

                this.resultsViewer.getQuantityProductorProcesando().setText(String.valueOf(this.controller.getModel().getResults().getQuantityProductorProcesando()));
                this.resultsViewer.getQuantityProductorFinalizados().setText(String.valueOf(this.controller.getModel().getResults().getQuantityProductorFinalizados()));
                this.resultsViewer.getQuantityProductorPendientes().setText(String.valueOf(this.controller.getModel().getResults().getQuantityProductorPendientes()));

                this.resultsViewer.getQuantityConsumidorProcesando().setText(String.valueOf(this.controller.getModel().getResults().getQuantityConsumidorProcesando()));
                this.resultsViewer.getQuantityConsumidorFinalizados().setText(String.valueOf(this.controller.getModel().getResults().getQuantityConsumidorFinalizados()));
                this.resultsViewer.getQuantityConsumidorPendientes().setText(String.valueOf(this.controller.getModel().getResults().getQuantityConsumidorPendientes()));
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }

    @Override
    public void componentResized(ComponentEvent e) {

    }

    @Override
    public void componentMoved(ComponentEvent e) {

    }

    @Override
    public void componentShown(ComponentEvent e) {

    }

    @Override
    public void componentHidden(ComponentEvent e) {

    }
}
