package packaging;

public class Wrapper implements Packaging{
    private String packingMethod = "Wrappers";
    @Override
    public String getPackingMethod() {
        return packingMethod;
    }
}
