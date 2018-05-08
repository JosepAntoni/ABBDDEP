/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici12;

/**
 *
 * @author jcc30
 */
public class NutritionFacts {
    private final int servingSize; //required
    private final int servings; //required
    private final int calories; //optional
    private final int fat; //optional
    private final int sodium; //optional
    private final int carbohydrate; //optional
    private NutritionFacts(Builder builder){
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
    
    public static class Builder{
        private final int servingSize;
        private final int servings;
        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;
        
        public Builder(int servingSize, int servings){
            this.servingSize = servingSize;
            this.servings = servings;
        }
        
        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }
        
        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }
        
        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }
        
        public Builder carbohydrate(int carbohydrate){
            this.carbohydrate = carbohydrate;
            return this;
        }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}
