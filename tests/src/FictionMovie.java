public class FictionMovie extends  Movie{
    String topic;

    public FictionMovie(String title, String director, double duration, String topic) {
        super(title, director, duration);
        this.topic = topic;
    }

    @Override
    public void getMovieInfo() {
        super.getMovieInfo();
        System.out.println("Topic of Movie: " + topic);
    }

}
