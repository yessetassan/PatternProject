import java.util.Arrays;

public class NutritionPlan {
    private int dailyCaloricIntake;
    private int[] macronutrientRatios; // Order: carbohydrates, proteins, fats
    private String[] mealPlans;
    private String fitnessGoal;
    private String[] dietaryRestrictions;

    public NutritionPlan(int dailyCaloricIntake, int[] macronutrientRatios, String[] mealPlans,
                         String fitnessGoal, String[] dietaryRestrictions) {
        this.dailyCaloricIntake = dailyCaloricIntake;
        this.macronutrientRatios = macronutrientRatios;
        this.mealPlans = mealPlans;
        this.fitnessGoal = fitnessGoal;
        this.dietaryRestrictions = dietaryRestrictions;
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "dailyCaloricIntake=" + dailyCaloricIntake +
                ", macronutrientRatios=" + Arrays.toString(macronutrientRatios) +
                ", mealPlans=" + Arrays.toString(mealPlans) +
                ", fitnessGoal='" + fitnessGoal + '\'' +
                ", dietaryRestrictions=" + Arrays.toString(dietaryRestrictions) +
                '}';
    }
}
