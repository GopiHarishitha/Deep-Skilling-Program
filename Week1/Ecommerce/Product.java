package Week1.Ecommerce;
public class Product{
    String productId;
    String productName;
    String category;
    Product(String id, String name, String category){
        this.productId = id;
        this.productName = name;
        this.category = category;
    }
    void setProductId(String id){
        this.productId = id;
    }
    void setProductName(String name){
        this.productName = name;
    }
    void setCategory(String cat){
        this.category = cat;
    }
    String getProductId(){
        return this.productId;
    }
    String getProductName(){
        return this.productName;
    }
    String getCategory(){
        return this.category;
    }
    String inString(){
        return this.productId+"-----"+this.productName+"-----"+this.category;
    }
}