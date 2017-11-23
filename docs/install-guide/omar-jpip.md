# OMAR JPIP

## Configuration

Additional configuration from [Common Config Settings](../../../omar-common/docs/install-guide/omar-common/#common-config-settings) can be added to the YAML.

* **quartz**
 * **jdbcStore** Specifies if the quartz queues should be persisted.  Currently have not setup persitent storeage with quartz.  Currently set to **false**.
 * **threadPool.threadCount** Defines the number of concurrent threads that can run.
* **jpip.server**
 * **cache** Is the location where to write the JP2 images
 * **ip** The location of the JPIP server IP.  This is the actual streaming server IP.  Not the jpip-app IP.  the jpip-app just translates imagery into a JP2 file for streaming
 * **url** The full URL of the jpip server. This is the actual streaming server IP.  Not the jpip-app IP.  the jpip-app just translates imagery into a JP2 file for streaming    
