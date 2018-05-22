/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Recuperacio1617;

/**
 *
 * @author jcc30
 */
public class Counter extends SequenceProcessor<String>{

    private int num_elems = 0;

    @Override
    public void processElement(String element) {
        num_elems++;
    }

    /**
     * @return the num_elems
     */
    public int getNum_elems() {
        return num_elems;
    }
    
}
