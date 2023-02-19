/*   This file is part of lanSimulation.
 *
 *   lanSimulation is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   lanSimulation is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with lanSimulation; if not, write to the Free Software
 *   Foundation, Inc. 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *   Copyright original Java version: 2004 Bart Du Bois, Serge Demeyer
 *   Copyright C++ version: 2006 Matthias Rieger, Bart Van Rompaey
 */
package lanSimulation.internals;

import lanSimulation.Network;
import lanSimulation.INode;

/**
A <em>Node</em> represents a single Node in a Local Area Network (LAN).
Several types of Nodes exist.
 */
public class Node implements INode {
	//enumeration constants specifying all legal node types
	/**
    A node with type NODE has only basic functionality.
	 */
	public static final byte NODE = 0;
	/**
    A node with type WORKSTATION may initiate requests on the LAN.
	 */
	public static final byte WORKSTATION = 1;
	/**
    A node with type PRINTER may accept packages to be printed.
	 */
	public static final byte PRINTER = 2;

	private byte type_;
	private String name_;
	private Node nextNode_;

	/**
	Construct a <em>Node</em> with given #type and #name.
	<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
	 */
	public Node(byte type, String name) {
		assert (type >= NODE) & (type <= PRINTER);
		type_ = type;
		name_ = name;
		nextNode_ = null;
	}

	/**
	Construct a <em>Node</em> with given #type and #name, and which is linked to #nextNode.
	<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
	 */
	public Node(byte type, String name, Node nextNode) {
		assert (type >= NODE) & (type <= PRINTER);
		type_ = type;
		name_ = name;
		nextNode_ = nextNode;
	}

	public void printHTMLOnNODE(StringBuffer buf) {
		buf.append("Node ");
		buf.append(name_);
		buf.append(" [Node]");
	}

	public void printHTMLOnWORKSTATION(StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(name_);
		buf.append(" [Workstation]");
	}

	public void printHTMLOnPRINTER(StringBuffer buf) {
		buf.append("Printer ");
		buf.append(name_);
		buf.append(" [Printer]");
	}

	public void printXMLOnPRINTER(StringBuffer buf) {
		buf.append("<printer>");
		buf.append(name_);
		buf.append("</printer>");
	}

	public void printXMLOnNODE(StringBuffer buf) {
		buf.append("<node>");
		buf.append(name_);
		buf.append("</node>");
	}

	public void printXMLOnWORKSTATION(StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(name_);
		buf.append("</workstation>");
	}

	public boolean isNode() {
		return type_ == NODE;
	}

	@Override
	public boolean isWorkstation() {
		return type_ == WORKSTATION;
	}

	@Override
	public boolean isPrinter() {
		return type_ == PRINTER;
	}

	@Override
	public void printHTMLOn(StringBuffer buf) {
		if (isNode()) {
			printHTMLOnNODE(buf);
		}
		else if (isWorkstation()) {
			printHTMLOnWORKSTATION(buf);
		}
		else if (isPrinter()) {
			printHTMLOnPRINTER(buf);
		}
		else {
			Network.printHTMLOnNONE(buf);
		}
	}

	@Override
	public void printXMLOn(StringBuffer buf) {
		if (isNode()) {
			printXMLOnNODE(buf);
		}
		else if (isWorkstation()) {
			printXMLOnWORKSTATION(buf);
		}
		else if (isPrinter()) {
			printXMLOnPRINTER(buf);
		}
		else {
			Network.printXMLOnNONE(buf);
		}
	}

	/**
    Holds the name of the Node.
	 */
	@Override
	public String getName_() {
		return name_;
	}

	/**
    Holds the next Node in the token ring architecture.
    @see Node
	 */
	@Override
	public Node getNextNode_() {
		return nextNode_;
	}

	@Override
	public void setNextNode_(Node nextNode_) {
		this.nextNode_ = nextNode_;
	}

	/**
    Holds the type of the Node.
	 */
	@Override
	public byte getType_() {
		return type_;
	}
}