//
// Generated by JTB 1.2.2++
//

package com.mod_snmp.smiparser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * nodeToken -> &lt;LAST_UPDATED_T&gt;
 * nodeToken1 -> &lt;UTC_TIME_T&gt;
 * </PRE>
 */
public class LastUpdatedPart implements Node {
    private Node parent;
    public NodeToken nodeToken;

    public LastUpdatedPart(NodeToken n0) {
        nodeToken = n0;
        if ( nodeToken != null ) nodeToken.setParent(this);
    }
    public int line() {
        return nodeToken.beginLine;
    }
    public String toString() {
        return nodeToken.toString();
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

