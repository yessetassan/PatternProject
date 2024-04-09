public class WeightLossNutritionPlanBuilder implements NutritionPlanBuilder {
    private int dailyCaloricIntake;
    private int[] macronutrientRatios = new int[3];
    private String[] mealPlans;
    private String fitnessGoal = "weight loss";
    private String[] dietaryRestrictions;

    @Override
    public WeightLossNutritionPlanBuilder setCaloricIntake(int caloricIntake) {
        this.dailyCaloricIntake = caloricIntake;
        return this;
    }

    @Override
    public WeightLossNutritionPlanBuilder setMacronutrientRatios(int carbohydrates, int proteins, int fats) {
        this.macronutrientRatios[0] = carbohydrates;
        this.macronutrientRatios[1] = proteins;
        this.macronutrientRatios[2] = fats;
        return this;
    }

    @Override
    public WeightLossNutritionPlanBuilder setMealPlans(String[] mealPlans) {
        this.mealPlans = mealPlans;
        return this;
    }

    @Override
    public WeightLossNutritionPlanBuilder setFitnessGoal(String fitnessGoal) {
        this.fitnessGoal = fitnessGoal;
        return this;
    }

    @Override
    public WeightLossNutritionPlanBuilder setDietaryRestrictions(String[] dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
        return this;
    }

    @Override
    public NutritionPlan build() {
        return new NutritionPlan(dailyCaloricIntake, macronutrientRatios, mealPlans, fitnessGoal, dietaryRestrictions);
    }
}
