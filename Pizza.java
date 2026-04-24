public abstract class Pizza {
    protected Borda borda;
    protected String[] sabores;

    public Pizza(Borda borda, String[] sabores) {
        this.borda = borda;
        this.sabores = sabores;
    }

    public abstract void montarPizza();

    protected void mostrarSabores() {
        for(String sabor : sabores) {
            System.out.println("- " + sabor);
        }
    }
}