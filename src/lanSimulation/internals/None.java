package lanSimulation.internals;

import lanSimulation.INode;

public class None extends Node {
    /**
     * Construct a <em>None</em> with given #type and #name.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     */
    public None(byte type, String name) {
        super((byte) -1, name);
    }

    /**
     * Construct a <em>None</em> with given #type and #name, and which is linked to #nextNode.
     * <p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
     *
     * @param type
     * @param name
     * @param nextNode
     */
    public None(byte type, String name, Node nextNode) {
        super((byte) -1, name, nextNode);
    }

    @Override
    public boolean isWorkstation() {
        return false;
    }

    @Override
    public boolean isPrinter() {
        return false;
    }

    @Override
    public void printHTMLOn(StringBuffer buf) {
        buf.append("(Unexpected)");
    }

    @Override
    public void printXMLOn(StringBuffer buf) {
        buf.append("<unknown></unknown>");
    }

    @Override
    public String getName_() {
        return null;
    }

    @Override
    public Node getNextNode_() {
        return null;
    }

    @Override
    public void setNextNode_(Node nextNode_) {

    }

    @Override
    public byte getType_() {
        return -1;
    }
}
