public class Note {
    private String name;
    private int pitch;

    public Note(String name) {
        this.name = name;
    }

    public Note(String name, int pitch) {
        this.name = name;
        this.pitch = pitch;
    }

    public String getName() {
        return this.name;
    }

    public int getPitch() {
        return this.pitch;
    }

}
