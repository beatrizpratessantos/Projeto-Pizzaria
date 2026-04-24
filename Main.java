public class Main {
    public static void main(String[] args) {

        String[] sabores1 = {
            "Calabresa",
            "Mussarela",
            "Pepperoni"
        };

        Pizza pizza1 = new PizzaGrande(
                new BordaCatupiry(),
                sabores1
        );

        pizza1.montarPizza();


        String[] sabores2 = {
            "Calabresa",
            "Mussarela",
            "Pepperoni"
        };

        Pizza pizza2 = new PizzaTradicional(
                new BordaTradicional(),
                sabores2
        );

        pizza2.montarPizza();


        String[] sabores3 = {
            "Chocolate",
            "Morango",
            "Banana"
        };

        Pizza pizza3 = new PizzaPequena(
                new BordaChocolate(),
                sabores3
        );

        pizza3.montarPizza();
    }
}