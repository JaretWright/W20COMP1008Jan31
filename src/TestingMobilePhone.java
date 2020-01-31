import java.util.List;

public class TestingMobilePhone {

    public static void main(String[] args)
    {
        List<String> brands = MobilePhone.getValidPhoneBrands();

        MobilePhone phone1 = new MobilePhone("Apple","iPhone X",64,12,876.99);
        MobilePhone phone2 = new MobilePhone("Apple","iPhone XI",128,14,1099.99);
        MobilePhone phone3 = new MobilePhone("Samsung","Galaxy S10", 64,16,876.99);
        MobilePhone phone4 = new MobilePhone("Samsung","Galaxy S10", 128,16,1076.99);
        MobilePhone phone5 = new MobilePhone("Samsung","Galaxy S10", 256,16,1476.99);


        System.out.printf("phone1: %s%n", phone1);
        System.out.printf("phone2: %s%n", phone2);
        System.out.printf("phone3: %s%n", phone3);

        PhoneStore jaretStore = new PhoneStore("Jarets Phone Emporium","10 Hurontario St");
        jaretStore.addPhone(phone1);
        jaretStore.addPhone(phone2);
        jaretStore.addPhone(phone3);
        jaretStore.addPhone(phone4);
        jaretStore.addPhone(phone5);

        System.out.printf("Inventory Value: $%.2f%n", jaretStore.getInventoryValue());
    }
}
