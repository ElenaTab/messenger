package Telegram;

public abstract class Message {

    private Long id;
    private Long sender;

    public Message() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSender() {
        return sender;
    }

    public void setSender(Long sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "Message{" +
                ", sender=" + sender +
                '}';
    }
}
