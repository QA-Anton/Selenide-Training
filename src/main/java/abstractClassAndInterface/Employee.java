package abstractClassAndInterface;

abstract class Employee {

    static String name;

    Employee(String name){this.name = name;}


    public int getSalary(){
        return 100000;
    }

    public abstract void work();
}
