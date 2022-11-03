public class Video extends File {
    int resolution;
    int fps;
    int duration;

    Video(String created_by, String name, long file_size, int resolution, int fps, int duration) {
        super(created_by, name, file_size);

        this.resolution = resolution;
        this.fps = fps;
        this.duration = duration;
    }

    boolean is_above_resolution(int resolution) {
        return this.resolution > resolution;
    }
}
