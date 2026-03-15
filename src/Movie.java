public class Movie {
    String title;
    String director;
    double duration;

    public Movie(String director, String title, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void getMovieInfo() {
        System.out.println(title);
        System.out.println(director);
        System.out.println(duration);
    }

    public void increaseDuration(int extraMinutes) {
        if (extraMinutes > 60) {
            System.out.println("You can't add more than 60 minutes");
        }
        else {
            System.out.println("You added: " + extraMinutes + " minutes");
        }
    }
}
