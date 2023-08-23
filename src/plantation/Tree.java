package plantation;

public class Tree extends Plant {
    private static int TREE_GROW_PER_SEASON = 5;

    Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    protected void goSpring() {
        height += TREE_GROW_PER_SEASON;
        super.goSpring();
    }

    @Override
    protected void goSummer() {
        height += TREE_GROW_PER_SEASON;
        super.goSummer();
    }

    @Override
    protected void goAutumn() {
        System.out.println(name + " is not growing in Autumn");
    }

    @Override
    protected void goWinter() {
        System.out.println(name + " is not growing in Winter");
    }
}
