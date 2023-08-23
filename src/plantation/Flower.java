package plantation;

public class Flower extends Plant {
    private static int FLOWER_GROWTH_PER_SEASON = 2;

    Flower(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowthPerSeason() {
        return 0;
    }

    @Override
    public void goSpring() {
        height += FLOWER_GROWTH_PER_SEASON;
        super.goSpring();
    }

    @Override
    protected void goSummer() {
        System.out.println(getName() + " is flowering in Summer");
    }

    @Override
    protected void goAutumn() {
        System.out.println(getName()e + " is being cut in Autumn");
    }

    @Override
    protected void goWinter() {
        System.out.println(getName() + " is NOT growing in Winter");
    }
}

