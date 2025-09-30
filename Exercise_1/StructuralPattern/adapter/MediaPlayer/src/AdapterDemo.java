public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        player.play("mp3", "song1.mp3");
        player.play("mp4", "movie1.mp4");
        player.play("vlc", "clip1.vlc");
        player.play("avi", "random.avi"); // unsupported
    }
}