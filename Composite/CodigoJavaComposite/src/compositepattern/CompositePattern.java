
package compositepattern;


public class CompositePattern {

   
    public static void main(String[] args) {
        // TODO code application logic here
        ProductLeaf pen = new ProductLeaf("Caneta", 1);
        ProductLeaf smartphone = new ProductLeaf("Smartphone", 1000);
        ProductLeaf tshirt = new ProductLeaf("Camiseta", 40);
        
        ProductComposite productBox = new ProductComposite();
        
        productBox.add(pen);
        productBox.add(tshirt);
        productBox.add(smartphone);
        System.out.println(productBox.getName());
        System.out.println("Soma de todos os produtos da caixa: R$ " + productBox.getPrice());
        
    }
    
}
