import geraldatastructure.QueueImplementation;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.addElements();
//        queue.removeElement();
        queue.offerElements();
        queue.retrievesBeginning();
        queue.pollElement();
    }
}