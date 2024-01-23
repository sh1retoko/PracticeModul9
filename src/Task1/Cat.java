package Task1;

public class Cat implements Move, Play {
    @Override
    public void move() {
        System.out.println("Кот двигается");
    }

    @Override
    public void play() {
        System.out.println("Кот играет");
    }
}
