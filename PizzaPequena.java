public class PizzaPequena extends Pizza {

    public PizzaPequena(Borda borda, String[] sabores) {
        super(borda, sabores);
    }

    public void montarPizza() {
        System.out.println("\nPizza Pequena");
        System.out.println(borda.tipoBorda());
        System.out.println("Sabores:");
        mostrarSabores();
    }
}