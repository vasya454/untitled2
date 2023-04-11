public class Lumberjack{
    String name;

    public Wood cutThree(Plant p) {
        if (p.type == Plant.Type.Tree) {
            return new Wood(p.measure());
        }
        else return new Wood(0);
    }
}
