package Homework1.Exercise2;

public class User {
    private static int ID = 1;
    private final int userId;
    private String name;
    private int age;

    public User(String name, int age) {
        userId = ID++;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
               "userId=" + userId +
               ", name='" + name + '\'' +
               ", age=" + age +
               "\n";
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
