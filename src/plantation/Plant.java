package plantation;

public abstract class Plant {
    private String name;
    private int height;
    private int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
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

