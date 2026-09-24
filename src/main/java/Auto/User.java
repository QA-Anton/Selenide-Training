package Auto;

public class User {

    public static void main(String[] args) {

        User user = new User();

        user.name = "Mike";
        user.age = 25;

        user.sayHello();

    }

    String name;
    int age;

    void sayHello() {
        System.out.println("Привет, меня зовут " + name + ", " + "мне " +  age + " лет");
    }
}

