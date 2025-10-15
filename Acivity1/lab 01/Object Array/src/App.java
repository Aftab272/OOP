public class App {
    public static void main(String[] args) throws Exception {
        Product[] products = {
            new Product(1,"Laptop",100),
            new Product(2,"Phone",700),
            new Product(3,"Tablet",500),
            new Product(4,"Headphone",150),
            new Product(5,"Charger")
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search:");
        String search = sc.nextLine();

        boolean found = false;
        for(Product p: products){
            if(p.name.equalsIgnoreCase(search)){
                System.out.println("Product Found:" + p.name+ "Price:$" +p.price);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Product not found");
        }

        }
    }

