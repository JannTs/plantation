package plantation;

public class Tree extends Plant {
    int tree_grow_per_season = 5;

    Tree(String name, int height, int age) {
        super(name, height, age);
    }

    @Override
    protected void goSpring() {
        height += tree_grow_per_season;
        super.goSpring();
    }

    @Override
    protected void goSummer() {
        height += tree_grow_per_season;
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
