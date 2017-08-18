# OMAR JPIP

## Dockerfile
```
FROM omar-ossim-base
EXPOSE 8080
RUN mkdir /usr/share/omar
COPY omar-jpip-app-1.0.0-SNAPSHOT.jar /usr/share/omar
RUN chown -R 1001:0 /usr/share/omar
RUN chown 1001:0 /usr/share/omar
RUN chmod -R g+rw /usr/share/omar
RUN find $HOME -type d -exec chmod g+x {} +
USER 1001
WORKDIR /usr/share/omar
CMD java -server -Xms256m -Xmx1024m -Djava.awt.headless=true -XX:+CMSClassUnloadingEnabled -XX:+UseGCOverheadLimit -Djava.security.egd=file:/dev/./urandom -jar omar-jpip-app-1.0.0-SNAPSHOT.jar
```
Ref: [omar-ossim-base](../../../omar-ossim-base/docs/install-guide/omar-ossim-base/)

## JAR
[http://artifacts.radiantbluecloud.com/artifactory/webapp/#/artifacts/browse/tree/General/omar-local/io/ossim/omar/apps/omar-jpip-app](http://artifacts.radiantbluecloud.com/artifactory/webapp/#/artifacts/browse/tree/General/omar-local/io/ossim/omar/apps/omar-jpip-app)

## Configuration

Additional configuration from [Common Config Settings](../../../omar-common/docs/install-guide/omar-common/#common-config-settings) can be added to the YAML.

* **quartz**
 * **jdbcStore** Specifies if the quartz queues should be persisted.  Currently have not setup persitent storeage with quartz.  Currently set to **false**.
 * **threadPool.threadCount** Defines the number of concurrent threads that can run.
* **jpip.server**
 * **cache** Is the location where to write the JP2 images
 * **ip** The location of the JPIP server IP.  This is the actual streaming server IP.  Not the jpip-app IP.  the jpip-app just translates imagery into a JP2 file for streaming
 * **url** The full URL of the jpip server. This is the actual streaming server IP.  Not the jpip-app IP.  the jpip-app just translates imagery into a JP2 file for streaming    
