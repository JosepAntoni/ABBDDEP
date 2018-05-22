/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Recuperacio1617;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author jcc30
 */
public class LinesIterator implements Iterator<String>{

    private final BufferedReader br;
    private String nextElem = null;
    
    public LinesIterator(BufferedReader br){
        this.br = br;
    }
    
    @Override
    public boolean hasNext() {
        return (nextElem != null);
    }

    @Override
    public String next(){
        String nextLine = nextElem;
        if(nextLine != null){
            nextElement();
            return nextLine;
        }else{
            throw new NoSuchElementException();
        }
    }

    private void nextElement(){
        try{
            nextElem = br.readLine();
        }catch(IOException ex){
            nextElem = null;
        }
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
}
