import java.util.Random;

public class Main {
    public static void task2() {
        Random random = new Random();
        double x = 10.0;
        double y = 30.0;

        if (x < 0 || y < 0) {
            System.out.println("Negative numbers are not allowed");
            return;
        }

        if(x > y) {
            double temp = x;
            x = y;
            y = temp;
        }

        double sum = 0;
        double min = y;
        double max = x;

        for (int i = 0; i < 8; i++) {
            double randomNumber = x + random.nextDouble() * (y - x);
            System.out.println(randomNumber);

            sum += randomNumber;

            if (randomNumber < min) {
                min = randomNumber;
            } else if (randomNumber > max) {
                max = randomNumber;
            }
        }

        double average = sum / 8;


    }

    public static void task1() {
        Movie movie = new Movie("John Wick", "Chad Stahelski", 120);
        FictionMovie fictionMovie = new FictionMovie("Avengers", "Joss Wheden", 140, "Heroes");

        movie.getMovieInfo();
        movie.increeaseDuration(30);

        fictionMovie.getMovieInfo();
    }

    public static void main(String[] args) {
        task1();
    }
}
