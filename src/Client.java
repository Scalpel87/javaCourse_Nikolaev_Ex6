import java.awt.*;

public class Client extends Person {
    public Client(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void print() {
        System.out.println("Имя клиента: " + name + ", вес: " + weight);
    }

    @Override
    void getVoice() {
        System.out.println("Привет клиентам!");
    }

    @Override
    void getCall() {
        System.out.println("Ура клиентам!");
    }
}
