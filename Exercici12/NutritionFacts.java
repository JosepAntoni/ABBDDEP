/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici12;

/**
 *
 * @author jcc30
 */
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;
    public NutritionFacts(NutritionFactsBuilder builder){
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    /**
     * @return the servingSize
     */
    public int getServingSize() {
        return this.servingSize;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return this.servings;
    }

    /**
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * @return the fat
     */
    public int getFat() {
        return this.fat;
    }

    /**
     * @return the sodium
     */
    public int getSodium() {
        return this.sodium;
    }

    /**
     * @return the carbohydrate
     */
    public int getCarbohydrate() {
        return this.carbohydrate;
    }
    
    public static class NutritionFactsBuilder{
        private final int servingSize;
        private final int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;
        
        public NutritionFactsBuilder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        
        public NutritionFactsBuilder calories(int calories){
            this.calories = calories;
            return this;
        }
        
        public NutritionFactsBuilder fat(int fat){
            this.fat = fat;
            return this;
        }
        
        public NutritionFactsBuilder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }
        
        public NutritionFactsBuilder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
