/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

/**
 *
 * @author jcc30
 */
public interface ComponentVisitor {
    void visit(Leaf l);
    void visit(Composite c);
}
