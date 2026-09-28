package Auto;

public class User {

    public static void main(String[] args) {

        User user = new User();

        user.name = "Mike";
        user.age = 25;

        user.sayHello();

    }



    // Делаем поля приватными, чтобы их нельзя было испортить снаружи
    private String name;
    private int age;

   public void sayHello() {
       System.out.println("Привет, меня зовут " + name + ", " + "мне " +  age + " лет");
    }

    // Метод для "безопасной записи" данных
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

