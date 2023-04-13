public class Pine extends Plant implements Cuttable {
    public Pine(double height) {
        super(height, Type.Tree);
    }
    public Pine(double height, Plant.Type type) {
        super(height, checkType(type));
    }

    @Override
    public Wood cutIt() {
        return new Wood(this.height*0.3);
    }

    private static Type checkType(Type type) {
        if (type == Type.Tree || type == Type.YoungTree || type == Type.TreeStump) {
            return type;
        }
        else return Type.Tree;
    }
}
