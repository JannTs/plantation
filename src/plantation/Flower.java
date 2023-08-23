package plantation;

public class Flower extends Plant {
    private static final int FLOWER_GROWTH_PER_SEASON = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowthPerSeason() {
        return FLOWER_GROWTH_PER_SEASON ;
    }

    @Override
    protected void goSummer() {
        setHeight(getHeight() + getGrowthPerSeason());
        System.out.println(getName() +
                " - now its height is: " + getHeight() +
                ", should grow by " + getGrowthPerSeason() +" centimeters per season "+
                " and this instance will soon be " + getAge() + " years old");
        System.out.println(getName() + " is flowering in Summer");
    }

    @Override
    protected void goAutumn() {
        System.out.println(getName() + " is being cut in Autumn");
    }

    @Override
    protected void goWinter() {
        System.out.println(getName() + " is NOT growing in Winter");
    }
}

