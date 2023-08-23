package plantation;

public class Tree extends Plant {
    private static final int TREE_GROWTH_PER_SEASON = 5;

    Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowthPerSeason() {
        return TREE_GROWTH_PER_SEASON;
    }

    @Override
    protected void goSummer() {
        setHeight(getHeight() + getGrowthPerSeason());
        System.out.println(getName() +
                " - now its height is: " + getHeight() +
                ", should grow by " + getGrowthPerSeason() +" centimeters per season "+
                " and this instance will soon be " + getAge() + " years old");
    }


    @Override
    protected void goAutumn() {
        System.out.println(getName() + " is not growing in Autumn");
    }

    @Override
    protected void goWinter() {
        System.out.println(getName() + " is not growing in Winter");
    }
}
