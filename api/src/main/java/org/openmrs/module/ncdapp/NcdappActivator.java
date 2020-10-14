package org.openmrs.module.ncdapp;

import org.openmrs.module.BaseModuleActivator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class NcdappActivator extends BaseModuleActivator {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * @see #started()
	 */
	public void started() {
		log.info("Started ncdapp");
	}
	
	/**
	 * @see #shutdown()
	 */
	public void shutdown() {
		log.info("Shutdown ncdapp");
	}
}
