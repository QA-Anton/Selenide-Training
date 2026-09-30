package abstractClassAndInterface;

public class QA extends Employee implements Testable {

    public QA(String name) { super(name); }

    @Override
    public void test() {
        System.out.println(name + "Тестирую...");
    }

    @Override
    public void work() {
        System.out.println(name + "Вджобываем!!!");
    }

    public static void main(String[] args) {
        QA tester = new QA("Иван");
        System.out.println("Зарплата: " + tester.getSalary());
        tester.work();
        tester.test();
    }
}
