package Auto;

public class Tester {

    private String name;
    private boolean isManual;

    public void setName(String name) {
        this.name = name;
    }

    public void setIsManual (boolean isManual) {
        this.isManual = isManual;
    }

    // Геттер для получения значения (чтобы потом проверить, что мы записали)
    public String getName() {
        return name;
    }

    public boolean getIsManual() {
        return isManual;
    }

    public static void main(String[] args) {

        Tester tester = new Tester();

        // 1. Устанавливаем значения через сеттеры
        tester.setName("Dude");
        tester.setIsManual(true);

        // 2. Пробуем получить их обратно (через геттер)
        System.out.println("Имя тестировщика: " + tester.getName());
        System.out.println("Тестрер мануал ? " + tester.getIsManual());


    }
}
