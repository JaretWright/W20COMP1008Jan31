import java.util.Arrays;
import java.util.List;

public class MobilePhone {
    private String make, model;
    private int memoryInGB;
    private double cameraResolution, price;

    /**
     * This is the constructor.  It will instantiate the object and set the instance
     * variables with VALID values
     */
    public MobilePhone(String make, String model, int memoryInGB, double cameraResolution, double price) {
        setMake(make);
        setModel(model);
        setMemoryInGB(memoryInGB);
        setCameraResolution(cameraResolution);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    /**
     * This method is static - that means we can call it WITHOUT an instance of
     * a mobile phone object.
     * @return
     */
    public static List<String> getValidPhoneBrands()
    {
        return Arrays.asList("Apple","Samsung","XTC","Nokia");
    }


    public void setMake(String make) {
        List<String> validMakes = getValidPhoneBrands();
        if (validMakes.contains(make))
            this.make = make;
        else
            throw new IllegalArgumentException("Valid makes are: "+validMakes);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        List<String> validModels = Arrays.asList("iPhone X","iPhone XI","Galaxy S10", "Mach 1");
        if (validModels.contains(model))
            this.model = model;
        else
            throw new IllegalArgumentException("Valid models are: " + validModels);
    }

    public int getMemoryInGB() {
        return memoryInGB;
    }

    public void setMemoryInGB(int memoryInGB) {
        this.memoryInGB = memoryInGB;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        if (cameraResolution>=0 && cameraResolution <=40)
            this.cameraResolution = cameraResolution;
        else
            throw new IllegalArgumentException("Resolution must be 0-40 Mp");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >=0 && price<=30000)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be in the range 0-30,000");
    }

    public String toString()
    {
        return String.format("%s %s", make, model);
    }
}
