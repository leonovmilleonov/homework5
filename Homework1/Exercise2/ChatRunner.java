package Homework1.Exercise2;


import java.util.ArrayList;
import java.util.List;

public class ChatRunner {
    public static void main(String[] args) {
        List<User> users1 = new ArrayList<>(List.of(
                new User("Ivan", 15),
                new User("Svetlana", 35),
                new User("Viktor", 20),
                new User("Ivan", 40)
        ));

        List<User> users2 = new ArrayList<>(List.of(
                new User("Fedor", 15),
                new User("Ira", 35),
                new User("Olga", 18),
                new User("Timofei", 39)
        ));

        List<User> users3 = new ArrayList<>(List.of(
                new User("Anastasia", 30),
                new User("Andrei", 44),
                new User("Viktor", 20)
        ));

        Chat chat1 = new Chat("Galaxy Chat", users1);
        Chat chat2 = new Chat("Family chat", users2);
        Chat chat3 = new Chat("Work chat", users3);

        Chats chats = new Chats();
        chats.add(chat1);
        chats.add(chat2);
        chats.add(chat3);

        System.out.println(chats);

        List<User> allUsers = chats.allUsers();
        System.out.println(allUsers);

        System.out.println(Chats.averageAge(allUsers));
    }
}
