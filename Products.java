package pit;


public class Products {
    
    private int orderId;
    private int id;
    private String name; 
    private int price;
    private int qty;
    
    public Products(int orderId, int id, String name, int price, int qty)
    {
        this.orderId = orderId;
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public int getOrderId() {
        return orderId;
    }
    public int getId()
    {
        return id;
    }
    
    public String getprd_NAME()
    {
        return name;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getQty()
    {
        return qty;
    }
    
}
