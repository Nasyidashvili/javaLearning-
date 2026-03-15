public class FictionMovie extends Movie{
    String topic;

    public FictionMovie(String director, String title, double duration, String topic) {
        super(director, title, duration);
        this.topic = topic;
    }

    @Override
    public void getMovieInfo() {
        super.getMovieInfo();
        System.out.println(topic);
    }
}
