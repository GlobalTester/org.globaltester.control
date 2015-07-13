package com.hjp.globaltester.control;

/**
 * This is an interface for remotely accessible objects that can be used
 * for external control.
 * 
 * @author mboonk
 *
 */
public interface RemoteControlHandler {
	/**
	 * @return the unique identifier of this handler
	 */
	public String getIdentifier();

	/**
	 * @return the type identifying the implemented interface
	 */
	public String getType();
}
