package dk.dtu.debugger.ecno.controllers;

import dk.dtu.imm.se.ecno.runtime.Interaction;

/**
 * 
 * @author REV 01/11/2016 - 
 *
 */
public interface IBreakpoint {

	/**
	 * 
	 * @param interaction the interaction that is to be executed.
	 * @return true - if engine should stop execution before this breakpoint. false otherwise.
	 */
	boolean isBreakpoint(Interaction interaction);
}
