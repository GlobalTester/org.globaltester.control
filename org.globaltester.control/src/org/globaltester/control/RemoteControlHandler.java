package org.globaltester.control;

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

	/**
	 * Return an adapter for this Handler to match the the provided transport agent. 
	 * @param c Interface to be implemented ba the returned Adapter
	 * @return
	 */
	public <T> T getAdapter(Class<T> c);
}
