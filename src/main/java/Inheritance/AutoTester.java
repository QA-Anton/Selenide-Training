package Inheritance;

public class AutoTester extends Tester{

    public static void main(String[] args) {

        // Создали объект автотестера, присвоили ему name из класса родителя
        AutoTester autoTester = new AutoTester();
        autoTester.name = "Тёма";
        // Вызвали метод родителя work и собственный метод writeCode
        autoTester.work();
        autoTester.writeCode();
        // Вызываем метод из родителя статическую
        // переменную (это возможно не создавая объект Tester)
        Tester.printCompany();
    }

    public void writeCode() {
        System.out.println("Пишу код для автотестов");
    }
}
