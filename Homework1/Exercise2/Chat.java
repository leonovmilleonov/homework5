package Homework1.Exercise2;

import java.util.List;

public class Chat {
    private final String chatName;
    private List<User> users;

    public Chat(String chatName, List<User> users) {
        this.chatName = chatName;
        this.users = users;
    }

    public String getChatName() {
        return chatName;
    }

    public List<User> getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "Chat{" +
               "chatName='" + chatName + '\'' +
               ", users=" + users +
               "}\n";
    }
}

