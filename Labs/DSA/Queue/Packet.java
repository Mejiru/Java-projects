package queue.examples;

public class Packet{
    private int Uid;
    private String message;

    public Packet() {
    }
    public Packet(String message, int uid) {
        this.Uid = uid;
        this.message = message;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int uid) {
        Uid = uid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

