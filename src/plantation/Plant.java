package plantation;

public class Plant {
    String name;
    int height;
    int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    void doSpring() {
        System.out.println(name + " has grown in Spring - " + height);
    }

    void doSummer() {
        System.out.println(name + " has grown in Summer - " + height);
    }

    void doAutumn() {
        System.out.println(name + " has not grown in Autumn - " + height);
    }

    void doWinter() {
        System.out.println(name + " has not grown in Winter - " + height);
    }

    void printInfo() {
        System.out.println(name + " has height " + height + " and is " + age + " years old");
    }
}

