public class Patinet extends Vehicle{
    private String model;
    
    public Patinet(String brand, int wheels, String model) {
        super(brand, wheels);
        this.setModel(model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void bikeLine() {
        System.out.println("Patinet "+getBrand()+" "+getModel()+" Si pot anar pel carril bici");
    }

    @Override
    void needITV() {
        System.out.println("Patinet "+getBrand()+" "+getModel()+" No necesita fer ITV");
    }

    

}
