import java.util.ArrayList;

public class PhoneStore {
    private String storeName;
    private String location;
    private ArrayList<MobilePhone> inventory;

    public PhoneStore(String storeName, String location) {
        setStoreName(storeName);
        setLocation(location);
        this.inventory = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getLocation() {
        return location;
    }

    /**
     * Normally there would be validation for this, but I am skipping that in the
     * interest of time
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<MobilePhone> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<MobilePhone> inventory) {
        this.inventory = inventory;
    }

    /**
     * This method will add a MobilePhone object to the inventory.
     */
    public void addPhone(MobilePhone newPhone)
    {
        inventory.add(newPhone);
    }

    /**
     * This method will loop over the inventory and return the total price
     */
    public double getInventoryValue()
    {
        double invValue = 0;
        for (MobilePhone phone : inventory)
        {
            System.out.printf("%s memory: %d price: $%.2f%n", phone, phone.getMemoryInGB(),
                                                            phone.getPrice());
            invValue += phone.getPrice();
        }

        return invValue;
    }

    /**
     * This method will search the inventory and return the most expensive phone
     */
    public MobilePhone getMostExpensive()
    {
        if (inventory.size()==0)
            return null;

        //assume the first element is the most expensive
        MobilePhone mostExpensive = inventory.get(0);

        //loop over all the phones to compare the prices
        for (MobilePhone phone : inventory)
        {
            if (phone.getPrice() > mostExpensive.getPrice())
                mostExpensive = phone;
        }

        return mostExpensive;
    }

    public MobilePhone getLeastExpensive()
    {
        if (inventory.size()==0)
            return null;

        //assume the first element is the most expensive
        MobilePhone leastExpensive = inventory.get(0);

        //loop over all the phones to compare the prices
        for (MobilePhone phone : inventory)
        {
            if (phone.getPrice() < leastExpensive.getPrice())
                leastExpensive = phone;
        }

        return leastExpensive;
    }


}
