package lanSimulation.internals;

import lanSimulation.INode;

public class Printer implements INode {

    private String name_;
    private Node nextNode_;

    public Printer(String name_) {
        this.name_ = name_;
    }

    public Printer(String name_, Node nextNode_) {
        this.name_ = name_;
        this.nextNode_ = nextNode_;
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
