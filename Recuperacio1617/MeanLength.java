/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Recuperacio1617;

/**
 *
 * @author jcc30
 */
public class MeanLength extends SequenceProcessor<String>{

    private double total_long = 0;
    private double num_lines = 0;

    @Override
    public void processElement(String element) {
        total_long += element.length();
        num_lines++;
    }

    /**
     * @return the meanlength
     */
    public double getMeanlength() {
        return total_long / num_lines;
    }
    
}
