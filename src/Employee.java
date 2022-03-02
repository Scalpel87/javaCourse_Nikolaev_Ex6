public class Employee extends Person{
    public Employee(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void print() {
        System.out.println("Имя работника: " + name + ", вес: " + weight);
    }

    @Override
    void getCall() {
        System.out.println("Ура рабочим!");
    }

    @Override
    void getVoice() {
        System.out.println("Привет рабочим!");
    }
}
