package BuilderDesignPattern;

public class BuilderPatternDemo {

    public static void main(String [] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        vegMeal.showItems();
        nonVegMeal.showItems();
        System.out.println("Builder Design Pattern");

    }
}
