public class Main {
    public static void main(String[] args) {
      ProductManager manager=new ProductManager();
      Product Computer=new Product();
      Computer.price=10000;
      Computer.name="";
      manager.add(Computer);
      ProductValidator productValidator=new ProductValidator();
      productValidator.nothing();
    }
}