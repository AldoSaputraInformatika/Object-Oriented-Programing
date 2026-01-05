//Package
//1) Packagea: Product.Data
package Product.data;

public class DataProduct {

    public String product;
    public String product1;
    public String product2;
    
    public String sepatu(String nama){
        product = nama;
        return product;
        
    }
    public String sepatu1(String nama){
        product1 = nama;
        return product1;
        
    }
    public String sepatu2(String nama){
        product2 = nama;
        return product2;
        
    }
}
//2) Package ProductPrice
package Product.price;

public class ProductPrice {

    public int sepatu1;
    public int sepatu2;
    public int sepatu3;

    public int sepatu1(int sepatu1) {
        this.sepatu1 = sepatu1;
        return this.sepatu1;
    }

    public int sepatu2(int sepatu2) {
        this.sepatu2 = sepatu2;
        return this.sepatu2;
    }

    public int sepatu3(int sepatu3) {
        this.sepatu3 = sepatu3;
        return this.sepatu3;
    }

}
//Distributor APP
package Product.App;

import Product.data.DataProduct;
import Product.price.ProductPrice;

public class Distributor {

    public static void main(String[] args) {
        DataProduct data = new DataProduct();
        ProductPrice price = new ProductPrice();

        data.sepatu("Adidas Adi Zero");
        data.sepatu1("Adidas Adi one");
        data.sepatu2("Adidas Adi two");

        price.sepatu1(1200000);
        price.sepatu2(1300000);
        price.sepatu3(1400000);

        System.out.println("========= Toko Sepatu Mak Uda =========");
        System.out.println(data.product  + "   : " + price.sepatu1);
        System.out.println(data.product1 + "    : " + price.sepatu2);
        System.out.println(data.product2 + "    : " + price.sepatu3);

    }
}

