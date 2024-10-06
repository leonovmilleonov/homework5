package Homework1.Exercise1;

public class Chat {
    private final String chatName;
    private int usersAmount;

    public Chat(String chatName, int usersAmount) {
        this.chatName = chatName;
        this.usersAmount = usersAmount;
    }

    public String getChatName() {
        return chatName;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    @Override
    public String toString() {
        return "Chat{" +
               "chatName='" + chatName + '\'' +
               ", usersAmount=" + usersAmount +
               '}';
    }
}
