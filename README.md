## Nutrition Plan Builder
# Project Overview
This project implements the Builder Pattern to create customized nutrition plans based on clients' fitness goals and dietary restrictions. It allows for flexible creation of NutritionPlan objects with varying properties such as daily caloric intake, macronutrient ratios, meal plans, fitness goals, and dietary restrictions.

# Features
* Custom Nutrition Plans: Generate nutrition plans tailored to individual requirements and goals.
* Support for Various Dietary Restrictions: Easily incorporate dietary restrictions such as gluten-free, vegan, and lactose-free options.
* Flexible Builder Pattern Implementation: Extend the base builder to create specific nutrition plans for weight loss, weight gain, or maintenance goals.
# Getting Started
# Prerequisites
* Java Development Kit (JDK) 11 or later.
# Installation
* Clone the repository or download the source code to your local machine.
* Navigate to the project directory from your command line or terminal.
# Project Structure
* NutritionPlan.java - Defines the structure of a nutrition plan.
* NutritionPlanBuilder.java - Interface for building nutrition plans.
* WeightLossNutritionPlanBuilder.java, WeightGainNutritionPlanBuilder.java, MaintenanceNutritionPlanBuilder.java - Concrete implementations of the NutritionPlanBuilder for various fitness goals.
* Main.java - Contains the main method to demonstrate building a nutrition plan.