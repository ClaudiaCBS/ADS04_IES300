
package compositepattern;


public class ProductLeaf implements IProductComponent{
    public String name;
    public double price;
    
    public ProductLeaf (String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;    
    }
    
    @Override
    public String getName() {
        return this.name;    
    }
    
}
