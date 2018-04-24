package Exercici1;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */
import java.util.*;
/**
 *
 * @author jcc30
 */
public class StringTokenizerAdaptor implements Iterator<Object>{

    private StringTokenizer st;
    
    public StringTokenizerAdaptor(StringTokenizer st){
        this.st = st;
    }
    @Override
    public boolean hasNext() {
        return st.hasMoreElements();
    }

    @Override
    public Object next() {
        return st.nextElement();
    }
    
}
