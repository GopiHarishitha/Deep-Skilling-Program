package Week1.Ecommerce;
public class ECommerce{
    static String name = "Amazon";
    ArrayList<Product> products;
    ECommerce(){
        this.products = new ArrayList<Product>();
    }
    ArrayList<Product> getProducts(){
        return this.products;
    }
    int equals(String s1, String s2){
        // returns 1 - if s1<s2
        // -1 - if s1>s2
        // 0 if s1==s2
        int n1 = s1.length();
        int n2 = s2.length();
        for (int i=0; i<n1 && i<n2; i++){
            if (s1.charAt(i)<s2.charAt(i)){
                return -1;
            }else if(s1.charAt(i)>s2.charAt(i)){
                return 1;
            }
        }
        return 0;
    }
    void add(Product product){
        int i = products.size()-1;
        while (i>=0 && this.equals(products.get(i).productId, product.productId)==1){
            i-=1;
        }
        this.products.add(i+1, product);
    }
    void display(){
        for(int i=0; i<this.products.size(); i++){
            Product product = this.products.get(i);
            System.out.println(product.productId+", "+product.productName+", "+ product.category);
        }
    }
    int linearSearch(String id){
        for(int i=0; i<products.size(); i++){
            Product product = products.get(i);
            if (product.productId.equals(id)){
                return i;
            }
        }
        return -1;
    }
    int binarySearch(String id){
        int low = 0;
        int high = this.products.size()-1;
        while (low<=high){
            int mid = (low+high)/2;
            Product product = this.products.get(mid);
            if (product.productId.equals(id)){
                return mid;
            }else if(this.equals(product.productId, id)==1){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
