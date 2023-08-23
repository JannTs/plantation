package plantation;

public class Tree extends Plant {
    private static int TREE_GROWTH_PER_SEASON = 5;

    Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    public int getGrowthPerSeason() {
        return TREE_GROWTH_PER_SEASON;
    }

    /*
     @Override
    protected void goSpring() {
      height += TREE_GROWTH_PER_SEASON;
        super.goSpring();
    }
    */

    @Override
    protected void goSummer() {
        height += TREE_GROWTH_PER_SEASON;
        //super.goSummer();
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
