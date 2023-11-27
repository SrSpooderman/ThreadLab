public class Main {
    public static void main(String[] args) {
        TJTLController controller = new TJTLController();
        Thread hilo = new Thread(controller.getViewer());
        hilo.start();
    }
}