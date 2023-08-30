package S7;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products){
        if (products == null){
            products = new ArrayList<>();
        }
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public Product getProduct(String name){
        for (Product product: products) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product: products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public BottleOfMilk getBottleOfMilk(String name, int fat){
        for (Product product: products){
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (product.getName().equals(name) && bottleOfMilk.getFat() == fat){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public Nuts getNuts(String name, double weight){
        for (Product product: products){
            if (product instanceof Nuts){
                Nuts nuts = (Nuts) product;
                if (product.getName().equals(name) && nuts.getWeight() == weight){
                    return nuts;
                }
            }
        }
        return null;
    }


}
