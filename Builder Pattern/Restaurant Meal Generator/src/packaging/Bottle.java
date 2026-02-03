package packaging;

public class Bottle implements Packaging{
    private String packingMethod = "Bottling";
    @Override
    public String getPackingMethod() {
        return packingMethod;
    }
}
