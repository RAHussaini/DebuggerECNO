package dk.dtu.debugger.ecno.listeners;

import dk.dtu.imm.se.ecno.core.IElementType;

public interface IElementTypeListener {

	public void elementTypesChanged(IElementType[] updatedList);
}
