package lanSimulation.internals;

import lanSimulation.INode;

public class Workstation implements INode {

    private String name_;
    private Node nextNode_;

    public Workstation(String name) {
        name_ = name;
    }

    public Workstation(String name, Node nextNode) {
        name_ = name;
        nextNode_ = nextNode;
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
