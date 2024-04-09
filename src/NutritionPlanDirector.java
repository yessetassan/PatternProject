public class NutritionPlanDirector {
    private NutritionPlanBuilder builder;

    public NutritionPlanDirector(NutritionPlanBuilder builder) {
        this.builder = builder;
    }

    public NutritionPlan createNutritionPlan() {
        return builder.build();
    }
}
