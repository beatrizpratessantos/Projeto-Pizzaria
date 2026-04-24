public class PizzaGrande extends Pizza {

    public PizzaGrande(Borda borda, String[] sabores) {
        super(borda, sabores);
    }

    public void montarPizza() {
        System.out.println("\nPizza Grande");
        System.out.println(borda.tipoBorda());
        System.out.println("Sabores:");
        mostrarSabores();
    }
}