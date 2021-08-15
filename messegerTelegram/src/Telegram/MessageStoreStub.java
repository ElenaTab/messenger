package Telegram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MessageStoreStub implements MessageStore {


    List<SendMessage> messages1 = Arrays.asList(
            new SendMessage(1L, "msg1_1"),
            new SendMessage(1L, "msg1_2"),
            new SendMessage(1L, "msg1_3"),
            new SendMessage(1L, "msg1_4"),
            new SendMessage(1L, "msg1_5")
    );
    List<SendMessage> messages2 = Arrays.asList(
            new SendMessage(2L, "msg2_1"),
            new SendMessage(2L, "msg2_2"),
            new SendMessage(2L, "msg2_3"),
            new SendMessage(2L, "msg2_4"),
            new SendMessage(2L, "msg2_5")
    );

    Map<Long, Message> messages = new HashMap<>();

    static Map<Long, Chat> chats = new HashMap<>();

    static {
        Chat chat1 = new Chat();
        chat1.addParticipant(0L);
        chat1.addParticipant(2L);

        Chat chat2 = new Chat();
        chat2.addParticipant(1L);
        chat2.addParticipant(2L);
        chat2.addParticipant(3L);

        chats.put(1L, chat1);
        chats.put(2L, chat2);
    }

    public MessageStoreStub() {
        for (SendMessage msg : messages1) {
            addMessage(1L, msg);
        }
        for (SendMessage msg : messages2) {
            addMessage(2L, msg);
        }
    }

    @Override
    public List<String> getChatsByUserId(String userId) {
        return null;
    }

    @Override
    public Chat getChatById(String chatId) {
        return null;
    }

    @Override
    public List<String> getMessagesFromChat(String chatId) {
        return null;
    }

    @Override
    public Message getMessageById(String messageId) {
        return null;
    }

    public void addMessage(long chatId, Message message) {

    }

    @Override
    public void addUserToChat(String userId, String chatId) {

    }

    @Override
    public Chat addChat(Chat chat) {
        return null;
    }

    @Override
    public Chat addChat(List<String> users) {
        return null;
    }
}
