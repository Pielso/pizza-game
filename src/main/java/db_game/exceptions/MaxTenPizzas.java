package db_game.exceptions;

public class MaxTenPizzas extends RuntimeException {

    public MaxTenPizzas() {
        super("You can not have more than ten Pizza Recipes");
    }

}
