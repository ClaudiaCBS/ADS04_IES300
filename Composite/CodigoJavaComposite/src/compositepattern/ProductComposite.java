
package compositepattern;

import java.util.ArrayList;
import java.util.List;


public class ProductComposite implements IProductComponent{
    private List<IProductComponent> children = new ArrayList<IProductComponent>();

    @Override
    public double getPrice() {
        double price = 0;
        for (IProductComponent child : children){
            price = price + child.getPrice();            
        }
        return price;
    }
    
    public void add(IProductComponent produto){
        children.add(produto);
    }
    
    public void remove(IProductComponent produto){
        children.remove(produto);   
    }
    
    @Override
    public String getName(){
        String names = "";
        for (IProductComponent child : children){
            
            String name = child.getName();
            names += name + "\n";    
        }
        return names;
    };
    
    
}
