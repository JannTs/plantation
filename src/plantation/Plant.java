package plantation;

public abstract class Plant {
    String name;
    int height;
    int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    protected void goSpring() {
        System.out.println(name + " has grown in Spring - " + height);
    }

    protected void goSummer() {
        System.out.println(name + " has grown in Summer - " + height);
    }

    protected void goAutumn() {
        System.out.println(name + " has not grown in Autumn - " + height);
    }

    protected void goWinter() {
        System.out.println(name + " has not grown in Winter - " + height);
    }

    protected void plantInformation() {
        System.out.println(name + " has height " + height + " and is " + age + " years old");
    }
}

