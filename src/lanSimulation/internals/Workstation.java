package lanSimulation.internals;

import lanSimulation.INode;

public class Workstation extends Node {

    /**
     * Construct a <em>Workstation</em> with given #type and #name.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     */
    public Workstation(byte type, String name) {
        super(Node.PRINTER, name);
    }

    /**
     * Construct a <em>Workstation</em> with given #type and #name, and which is linked to #nextNode.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     * @param nextNode
     */
    public Workstation(byte type, String name, Node nextNode) {
        super(Node.PRINTER, name, nextNode);
    }


    /**
     * Construct a <em>Workstation</em> with given #name.
     *
     * @param name
     */
    public Workstation(String name) {
        super(Node.PRINTER, name);
    }


    /**
     * Construct a <em>Workstation</em> with given #name and which is linked to #nextNode.
     *
     * @param name
     * @param nextNode
     */
    public Workstation(String name, Node nextNode) {
        super(Node.PRINTER, name, nextNode);
    }

    @Override
    public boolean isWorkstation() {
        return true;
    }

    @Override
    public boolean isPrinter() {
        return false;
    }

    @Override
    public void printHTMLOn(StringBuffer buf) {
        buf.append("Workstation ");
        buf.append(name_);
        buf.append(" [Workstation]");
    }

    @Override
    public void printXMLOn(StringBuffer buf) {
        buf.append("<workstation>");
        buf.append(name_);
        buf.append("</workstation>");
    }

    @Override
    public String getName_() {
        return name_;
    }

    @Override
    public Node getNextNode_() {
        return nextNode_;
    }

    @Override
    public void setNextNode_(Node nextNode_) {
        this.nextNode_ = nextNode_;
    }

    @Override
    public byte getType_() {
        return Node.WORKSTATION;
    }
}
