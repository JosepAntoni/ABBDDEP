/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

/**
 *
 * @author jcc30
 */
public class SumVisitor extends AcyclicVisitor{

    private int sum = 0;
    
    @Override
    protected void doVisitLeaf(Leaf l) {
        sum += l.getInfo();
    }

    
}
