import java.util.Date;

public abstract class Person implements Printable, SeasonHandler {
    String name;
    int weight;


    public Person(String name, int weight) {
        this.name = name;
        this.weight = weight;

    }

    void getVoice(){
        System.out.println("Привет!");
    }

    void getCall(){
        System.out.println("Ура!");
    }

    public void print() {
        System.out.println("Имя: " + name + ", вес: " + weight);
    }

    @Override
    public void checkSeason() {
        int month = new Date().getMonth() + 1;
        if (month <= 2 || month >= 11) System.out.println("Сейчас " + Season.WINTER + ", цвет сезона " + Season.WINTER.getColor().toString());//Зима
        else    if (month >= 3 && month <= 5) System.out.println("Сейчас " + Season.SPRING + ", цвет сезона " + Season.SPRING.getColor().toString());//Весна
                else    if (month >= 6 && month <= 9) System.out.println("Сейчас " + Season.SUMMER + ", цвет сезона " + Season.SUMMER.getColor().toString());//Лето
                        else System.out.println("Сейчас " + Season.AUTUMN + ", цвет сезона " + Season.AUTUMN.getColor().toString());//Осень
    }
}
