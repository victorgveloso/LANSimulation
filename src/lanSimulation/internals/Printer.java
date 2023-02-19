package lanSimulation.internals;

import lanSimulation.INode;

public class Printer extends Node {

    /**
     * Construct a <em>Printer</em> with given #type and #name.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     */
    public Printer(byte type, String name) {
        super(Node.PRINTER, name);
    }

    /**
     * Construct a <em>Printer</em> with given #type and #name, and which is linked to #nextNode.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     * @param nextNode
     */
    public Printer(byte type, String name, Node nextNode) {
        super(Node.PRINTER, name, nextNode);
    }


    /**
     * Construct a <em>Printer</em> with given #name.
     *
     * @param name
     */
    public Printer(String name) {
        super(Node.PRINTER, name);
    }


    /**
     * Construct a <em>Printer</em> with given #name and which is linked to #nextNode.
     *
     * @param name
     * @param nextNode
     */
    public Printer(String name, Node nextNode) {
        super(Node.PRINTER, name, nextNode);
    }

    @Override
    public boolean isWorkstation() {
        return false;
    }

    @Override
    public boolean isPrinter() {
        return true;
    }

    @Override
    public void printHTMLOn(StringBuffer buf) {
        buf.append("Printer ");
        buf.append(name_);
        buf.append(" [Printer]");
    }

    @Override
    public void printXMLOn(StringBuffer buf) {
        buf.append("<printer>");
        buf.append(name_);
        buf.append("</printer>");
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
        return Node.PRINTER;
    }
}
