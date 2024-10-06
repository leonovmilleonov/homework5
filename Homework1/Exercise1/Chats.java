package Homework1.Exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Chats {
    private List<Chat> chatList;

    public Chats() {
        chatList = new ArrayList<>();
    }

    public void add(Chat chat) {
        chatList.add(chat);
    }

    public void display() {
        System.out.println(chatList);
    }

    public void deleteAllLess1000() {
        ListIterator<Chat> chatListIterator = chatList.listIterator();
        while (chatListIterator.hasNext()) {
            Chat currentChat = chatListIterator.next();
            if (currentChat.getUsersAmount() < 1000) {
                chatListIterator.remove();
            }
        }
    }

    /**
     * sorts by number of users. If the number of users is equal, sorts by name
     */
    public void byUsersAmountSort() {
        chatList.sort(new UsersAmountComparator());
    }

    public void defaultSort() {
        chatList.sort(Comparator.comparing(Chat::getChatName));
    }

    public static class UsersAmountComparator implements Comparator<Chat> {

        @Override
        public int compare(Chat o1, Chat o2) {
            int result = Integer.compare(o1.getUsersAmount(), o2.getUsersAmount());
            if (result == 0) {
                return o1.getChatName().compareTo(o2.getChatName());
            }
            return result;
        }
    }
}
