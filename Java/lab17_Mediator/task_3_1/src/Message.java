public class Message {
    private String contents;
    private Plane plane;

    public Message (String contents){
        this.contents = contents;
    }

    public Message (String contents, Plane plane){
        this.contents = contents;
        this.plane = plane;
    }

    public String getContents() {
        return contents;
    }

    public Plane getPlane(){
        return plane;
    }
}
