package lanSimulation;

import lanSimulation.internals.Node;

public interface INode {
    boolean isWorkstation();

    boolean isPrinter();

    void printHTMLOn(StringBuffer buf);

    void printXMLOn(StringBuffer buf);

    String getName_();

    Node getNextNode_();

    void setNextNode_(Node nextNode_);

    byte getType_();
}
