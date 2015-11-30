//
// Generated by JTB 1.2.2++
//

package com.mod_snmp.smiparser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * name -> ValueIdentifier() [ ->  &lt;LEFT_PAREN_T&gt;
 *                             numval -> NumericValue()
 *                             -> &lt;RIGHT_PAREN_T&gt; ]
 * numval -> NumericValue()
 * </PRE>
 */
public class OidValue implements Node {
    private Node parent;
    public Identifier name;
    private boolean grammarSet;
    public NumericValue numval;

    public OidValue() {
        grammarSet = false;
        name = null;
        numval = new NumericValue(-1);
    }
    public OidValue(Identifier id) {
        grammarSet = true;
        name = id;
        if ( name != null ) name.setParent(this);
        numval = new NumericValue(-1);
    }
    public OidValue(Identifier id, NumericValue nr) {
        grammarSet = true;
        name = id;
        if ( name != null ) name.setParent(this);
        numval = nr;
        if ( numval != null ) numval.setParent(this);
    }
    public OidValue(NumericValue nr) {
        grammarSet = false;
        name = null;
        numval = nr; 
        if ( numval != null ) numval.setParent(this);
    }
    public String toString() {
        if (name != null) {
            return name.toString();
        }
        return numval.toString();
    }
    public int line() {
        if (name != null) {
            return name.line();
        }
        return numval.line();
    }
    public void setName(Identifier id) {
        name = id;
        if ( name != null ) name.setParent(this);
    }
    public void setName(String idStr) {
        name = Identifier.Value(new NodeToken(idStr));
        if ( name != null ) name.setParent(this);
    }
    public void setNumber(NumericValue nr) {
        numval = nr;
        if ( numval != null ) numval.setParent(this);
    }
    public Identifier getName() {
        return name;
    }
    public NumericValue getNumber() {
        return numval;
    }
    public boolean isGrammarSet() {
        return grammarSet;
    }
    public boolean hasName() {
        return (name != null);
    }
    public boolean hasNumber() {
        return (numval != null) && (numval.getValue() > -1);
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

