/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

import java.util.*;

/**
 *
 * @author jcc30
 */
public class CountVisitor implements ComponentVisitor{

    private int counter = 0, sum = 0;
    private Set<Component> visited = new HashSet<>();
    
    @Override
    public void visit(Leaf l) {
        if(!visited.contains(l)){
            visited.add(l);
            counter += 1;
            sum += l.getInfo();
        }
    }

    @Override
    public void visit(Composite c) {
        if(!visited.contains(c)){
            visited.add(c);
            for (Component subc : c.getComponents()){
                subc.accept(this);
            }
        }
    }

    /**
     * @return the counter
     */
    public int getCounter() {
        return counter;
    }
    
}
