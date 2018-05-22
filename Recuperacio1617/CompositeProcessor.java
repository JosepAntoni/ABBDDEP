/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Recuperacio1617;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcc30
 */
public class CompositeProcessor<E> extends SequenceProcessor <E> {

    private List<SequenceProcessor<E>> components = new ArrayList<>();
    
    public void addProcessor(SequenceProcessor<E> sp){
        components.add(sp);
    }
    
    @Override
    protected void processElement(E element) {
        for(SequenceProcessor<E> sp: components){
            sp.processElement(element);
        }
    }
    
}
