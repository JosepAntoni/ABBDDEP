package Exercici1;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */
import java.util.*;

/**
 *
 * @author jcc30
 */
public class StringTokenizerAdaptorExtends extends StringTokenizer 
        implements Iterator<Object>{

    public StringTokenizerAdaptorExtends(String str, String delim, 
            boolean returnDelims) {
        super(str, delim, returnDelims);
        
    }
    
    public StringTokenizerAdaptorExtends(String str, String delim){
        super(str,delim);
        
    }
    
    public StringTokenizerAdaptorExtends(String str){
        super(str);
        
    }

    @Override
    public boolean hasNext() {
        return super.hasMoreElements();
    }
    
    @Override
    public Object next() {
        return super.nextElement();
    }
    
}
