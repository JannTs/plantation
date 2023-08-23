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

    void goSpring() {
        System.out.println(name + " has grown in Spring - " + height);
    }

    void goSummer() {
        System.out.println(name + " has grown in Summer - " + height);
    }

    void goAutumn() {
        System.out.println(name + " has not grown in Autumn - " + height);
    }

    void goWinter() {
        System.out.println(name + " has not grown in Winter - " + height);
    }

    void Information() {
        System.out.println(name + " has height " + height + " and is " + age + " years old");
    }
}

