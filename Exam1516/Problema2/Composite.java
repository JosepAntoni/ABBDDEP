/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

/**
 *
 * @author jcc30
 */
public class Composite extends Component{
    
    public void accept (ComponentVisitor visitor){
        visitor.visit(this);
    }

    Iterable<Component> getComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
