package Homework1.Exercise1;

public class ChatRunner {
    public static void main(String[] args) {
        Chats chats = new Chats();
        chats.add(new Chat("Cash Only", 500));
        chats.add(new Chat("We’re Fur Real", 3409));
        chats.add(new Chat("The Ketchup Krew", 2141));
        chats.add(new Chat("We Won’t Stop Talking", 4880));
        chats.add(new Chat("We Know What You Did", 1415));
        chats.add(new Chat("The Best Chat Name", 221));
        chats.add(new Chat("Lettuce Entertain You", 293));
        chats.add(new Chat("We’re All Needy", 547));
        chats.add(new Chat("Talk Is Cheap", 1297));
        chats.add(new Chat("The Talent Pool", 1327));

        chats.display();

        chats.deleteAllLess1000();

        chats.display();

        chats.byUsersAmountSort();

        chats.display();

        chats.defaultSort();

        chats.display();


    }


}
