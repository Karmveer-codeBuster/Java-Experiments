package Experiment2;
class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); 
        setPricePerItem(pricePerItem); 
    }

    
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

   
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0; 
    }

    
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0; 
    }

    
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
}


public class Question22 {
    public static void main(String[] args) {
       
        Invoice invoice = new Invoice("P123", "Hammer", 5, 250.0);

       
        System.out.println("--- Invoice Details ---");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: ₹" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: ₹" + invoice.getInvoiceAmount());

        
        invoice.setQuantity(-3); 
        invoice.setPricePerItem(-100.0); 
        invoice.setPartNumber("P124");
        invoice.setPartDescription("Screwdriver");

       
        System.out.println("\n--- Updated Invoice Details ---");
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: ₹" + invoice.getPricePerItem());
        System.out.println("Invoice Amount: ₹" + invoice.getInvoiceAmount());
    }
}

