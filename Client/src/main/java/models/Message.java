package models;

/* 
 * POJO for an Message object
 */
public class Message {
    private String sequence;
    private String timestamp;
    private String fromid;
    private String toid;
    private String message;

    public Message (String message, String fromId, String toId) {
        this.toid = toId;
        this.fromid = fromId;
        this.message = message;
    }

    public String getSequence() {
        return this.sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getFromid() {
        return this.fromid;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
    }

    public String getToid() {
        return this.toid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}