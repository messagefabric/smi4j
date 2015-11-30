//
// Generated by JTB 1.2.2++
//

package com.mod_snmp.smiparser.syntaxtree;

/**
 * Grammar production:
 * <PRE>
 * -> &lt;DESCRIPTION_T&gt;
 * descr -> &lt;TEXT_T&gt;
 * </PRE>
 */
public class DescriptionPart implements Node {
    private Node parent;
    public NodeToken descr;

    public DescriptionPart(NodeToken n0) {
        descr = n0;
        if ( descr != null ) descr.setParent(this);
    }

    public DescriptionPart() {
        descr = null;
    }
    public int line() {
        return descr.beginLine;
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

