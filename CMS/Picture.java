public class Picture extends File {
    int resolution;

    Picture(String created_by, String name, long file_size, int resolution) {
        super(created_by, name, file_size);
        this.resolution = resolution;
    }

    boolean is_above_resolution(int resolution) {
        return this.resolution > resolution;
    }
}
