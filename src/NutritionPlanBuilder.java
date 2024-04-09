public interface NutritionPlanBuilder {
    NutritionPlanBuilder setCaloricIntake(int caloricIntake);
    NutritionPlanBuilder setMacronutrientRatios(int carbohydrates, int proteins, int fats);
    NutritionPlanBuilder setMealPlans(String[] mealPlans);
    NutritionPlanBuilder setFitnessGoal(String fitnessGoal);
    NutritionPlanBuilder setDietaryRestrictions(String[] dietaryRestrictions);
    NutritionPlan build();
}