package nl.saxion.oop.week1;

public class Video {
    private String video_id;
    private String title;
    private String channel_title;
    private int views;
    private int likes;
    private int dislikes;
    private Boolean watched = false;

    public Video(String video_id, String title, String channel_title, int views, int likes, int dislikes) {
        this.video_id = video_id;
        this.title = title;
        this.channel_title = channel_title;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return title + " - " + video_id + " (" + views + " views)";
    }

    public Boolean getWatched() {
        return watched;
    }

    public void watch() {
        watched = true;
    }

}
