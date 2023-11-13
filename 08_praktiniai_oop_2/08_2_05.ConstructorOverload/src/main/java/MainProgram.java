
public class MainProgram {

    public static void main(String[] args) {
        // Test your class here
        Product typeMeasure = new Product("Type measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product type = new Product("Type", 5);

        System.out.println(typeMeasure);
        System.out.println(plaster);
        System.out.println(type);
    }
}
