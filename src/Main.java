public class Main {
    public static void main(String[] args) {
        WeightLossNutritionPlanBuilder builder = new WeightLossNutritionPlanBuilder();

        builder.setCaloricIntake(2000)
                .setMacronutrientRatios(50, 30, 20)
                .setMealPlans(new String[]{"Oatmeal for breakfast", "Chicken salad for lunch", "Steak and vegetables for dinner"})
                .setFitnessGoal("weight loss")
                .setDietaryRestrictions(new String[]{"gluten-free"});

        NutritionPlan plan = builder.build();

        System.out.println(plan);
    }
}
