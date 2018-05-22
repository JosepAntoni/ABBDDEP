/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Recuperacio1617;

import java.util.Iterator;

/**
 *
 * @author jcc30
 */
public abstract class SequenceProcessor<E> {
    public void processSequence(Iterator<E> iterator){
        while (iterator.hasNext()){
            E element = iterator.next();
            processElement(element);
        }
    }
    protected abstract void processElement(E element);
}
