public class File {
    String created_by;
    String name;
    long file_size;

    File(String created_by, String name, long file_size) {
        this.created_by = created_by;
        this.name = name;
        this.file_size = file_size;
    }

    boolean is_above_size(long file_size) {
        return this.file_size > file_size;
    }

    boolean has_access(String created_by) {
        return this.created_by.equals(created_by);
    }
}
