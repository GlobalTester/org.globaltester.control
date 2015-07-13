package com.hjp.globaltester.control;

/**
 * This class is intended as the root of all remotely accessible control
 * handlers. It provides sensible default behavior to be overridden if
 * necessary.
 * 
 * @author mboonk
 *
 */
public abstract class AbstractRemoteControlHandler implements
		RemoteControlHandler {
	@Override
	public String getType() {
		return this.getClass().getCanonicalName();
	}
}
