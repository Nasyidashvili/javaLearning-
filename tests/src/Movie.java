public class Movie {
    String title;
    String director;
    double duration;

    public Movie(String title, String director, double duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void getMovieInfo() {
        System.out.println("title of Movie: " + title);
        System.out.println("Director of Movie: " + director);
        System.out.println("Duration of Movie: " + duration);
    }

    public void increeaseDuration(int extraMinutes) {
        if(extraMinutes > 60) {
            System.out.println("You can't add more than 60 minutes");
        } else {
            duration += extraMinutes;
            System.out.println("Duration of Movie is now: " + duration + " minutes");
        }
    }
}
