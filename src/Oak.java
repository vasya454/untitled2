public class Oak extends Plants implements Cuttable{
    public Oak(double height) {
        super(height);
    }


    @Override
    public Wood cutIt(Plants p) {
        return new Wood(height*0.3);
    }
}
