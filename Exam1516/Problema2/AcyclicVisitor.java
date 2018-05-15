/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

import java.util.*;

/**
 *
 * @author jcc30
 */
public abstract class AcyclicVisitor implements ComponentVisitor{
    
    private Set<Component> visited = new HashSet<>();
    
    @Override
    public void visit(Leaf l) {
        if(!visited.contains(l)){
            visited.add(l);
            doVisitLeaf(l);
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

    protected abstract void doVisitLeaf(Leaf l);
}
