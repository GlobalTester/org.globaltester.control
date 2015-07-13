package com.hjp.globaltester.control;

public abstract class AbstractRemoteControlHandler implements RemoteControlHandler {
	@Override
	public String getType() {
		return this.getClass().getCanonicalName();
	}
}
