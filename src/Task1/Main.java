package Task1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Cat cat = new Cat();
        Guitar guitar = new Guitar();

        Move[] moves = {car, cat};
        Play[] plays = {cat, guitar};

        for (Move move: moves) {
            move.move();
        }

        System.out.println("-----------------------");

        for (Play play : plays) {
            play.play();
        }
    }
}
