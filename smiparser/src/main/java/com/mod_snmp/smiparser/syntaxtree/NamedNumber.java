//
// Generated by JTB 1.2.2++
//

package com.mod_snmp.smiparser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * name -> ValueIdentifier()
 * -> &lt;LEFT_PAREN_T&gt;
 * number -> NumericValue()
 * -> &lt;RIGHT_PAREN_T&gt;
 * </PRE>
 */
public class NamedNumber implements Node {
    private Node parent;
    public Identifier name;
    public NumericValue number;

    public NamedNumber(Identifier n0, NumericValue n1) {
        name = n0;
        if ( name != null ) name.setParent(this);
        number = n1;
        if ( number != null ) number.setParent(this);
    }
    public int line() {
        return name.line();
    }
    public String toString() {
        return name.toString();
    }
    public long getValue() {
        return number.getValue();
    }
    public void accept(com.mod_snmp.smiparser.visitor.Visitor v) {
        v.visit(this);
    }
    public Object accept(com.mod_snmp.smiparser.visitor.ObjectVisitor v, Object argu) {
        return v.visit(this,argu);
    }
    public void setParent(Node n) { parent = n; }
    public Node getParent()       { return parent; }
}

