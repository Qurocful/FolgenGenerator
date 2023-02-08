package DreiFragezeichen;

public class Main {

    public static String generator(int min, int max) {

        int rand = (int) (Math.random() * (max - min) + min);

        return "Folge: " + (rand) + " " + new Titles(rand);
    }

    public static void main(String[] args) {
        System.out.println(generator(1, 222));
    }
}
