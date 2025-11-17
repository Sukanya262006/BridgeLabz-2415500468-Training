package generics;

interface MealPlan { void showPlan(); }

class VegetarianMeal implements MealPlan {
    public void showPlan(){ System.out.println("Vegetarian Plan"); }
}

class KetoMeal implements MealPlan {
    public void showPlan(){ System.out.println("Keto Plan"); }
}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan){ this.plan = plan; }
    void display(){ plan.showPlan(); }
}

class MealUtil {
    public static <T extends MealPlan> void generateMeal(T meal){
        meal.showPlan();
    }
}

public class Q15 {
    public static void main(String[] args){
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        vegMeal.display();
        MealUtil.generateMeal(new KetoMeal());
    }
}
