public class PizzaTradicional extends Pizza {

    public PizzaTradicional(Borda borda, String[] sabores) {
        super(borda, sabores);
    }

    public void montarPizza() {
        System.out.println("\nPizza Tradicional");
        System.out.println(borda.tipoBorda());
        System.out.println("Sabores:");
        mostrarSabores();
    }
}