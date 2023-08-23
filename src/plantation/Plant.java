package plantation;

public abstract class Plant {
    private final String name;
    int height;
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

    public void incrAge() {
        this.age++;
    }

    public abstract int getGrowthPerSeason();

   public void goSpring() {
        incrAge();
        System.out.println(getName() + " has get growth per season in Spring - " + getHeight());
    }

    //protected void goSummer() {
    //      System.out.println(name + " has grown in Summer - " + height);
    //  }
    protected abstract void goSummer();

    protected abstract void goAutumn();

    protected void goWinter() {
        System.out.println(getName() + " has not grown in Winter - " + getHeight());
    }

    protected void plantInformation() {
        System.out.println(getName() + " has height " + getHeight() + " and is " + getAge() + " years old");
    }
}

