package lanSimulation.internals;

import lanSimulation.INode;

public class None implements INode {
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
