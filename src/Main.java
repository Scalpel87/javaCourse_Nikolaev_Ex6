import java.awt.*;

/**
 * Придумать индивидуальное семейство классов на основе разобранного
 * примера (Создать два класса, которые будет наследовать поля и методы от
 * абстрактного класса. Также дочерние классы должны наследовать 2
 * интерфейса:
 * 1. Должен давать возможность выводить поля класса.
 * 2. Выводить сообщение: «Сейчас *Время года из перечисления*. *Цвет
 * сезона*»).
 *
 * Так же необходимо реализовать перечисление, в котором будут
 * объявлены дополнительные поля (они должны быть прописаны как
 * приватные).
 *
 * Тема задания:
 *
 * Абстрактный класс - Person.
 *
 * Класс — Client, Employee
 *
 * Интерфейсы - Printable, SeasonHandler.
 *
 * Перечисление - Season(color) (Время года, с привязкой цвета этого сезона).
 *
 * @author     Sergey Nikolaev
 */

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Вова", 78);
        employee.print();
        employee.getCall();
        employee.getVoice();
        Client client = new Client("Женя", 98);
        client.print();
        client.getCall();
        client.getVoice();
        employee.checkSeason();
    }
}
