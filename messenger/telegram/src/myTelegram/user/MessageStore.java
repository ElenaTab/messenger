package myTelegram.user;

import java.util.List;

public interface MessageStore {


    List<String> getChatsByUserId(String userId);


    Chat getChatById(String chatId);


    List<String> getMessagesFromChat(String chatId);


    Message getMessageById(String messageId);


    void addMessage(String chatId, Message message);


    void addUserToChat(String userId, String chatId);


    Chat addChat(Chat chat);

    Chat addChat(List<String> users);
}