public class Cotxe extends Vehicle{
    private String color, matricula;
    public Cotxe(String brand, int wheels, String color, String matricula) {
        super(brand, wheels);
        this.setColor(color);
        this.setMatricula(matricula);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    void bikeLine() {
        System.out.println("Cotxe "+getBrand()+" No pot anar pel carril bici");
    }

    @Override
    void needITV() {
        System.out.println("Cotxe "+getBrand()+" Si necesita fer ITV");
    }
    
    
}
