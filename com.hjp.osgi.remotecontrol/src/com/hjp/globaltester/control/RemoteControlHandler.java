package com.hjp.globaltester.control;

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
