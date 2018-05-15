/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1516.Problema2;

/**
 *
 * @author jcc30
 */
public class Leaf extends Component{
    
    public void accept(ComponentVisitor visitor){
        visitor.visit(this);
    }
    
    public int getInfo(){
        return 1;
    }
}
