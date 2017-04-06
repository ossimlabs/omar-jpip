# omar-jpip

[![Build Status](https://jenkins.radiantbluecloud.com/buildStatus/icon?job=omar-jpip-dev)]()

### Required environment variable
- OMAR_COMMON_PROPERTIES

### Optional environment variables
Only required for Jenkins pipelines or if you are running Artifactory and/or Openshift locally

- OPENSHIFT_USERNAME
- OPENSHIFT_PASSWORD
- ARTIFACTORY_USER
- ARTIFACTORY_PASSWORD

## How to Install omar-jpip-app locally

1. Install omar-oms-plugin [Go here for instructions](https://github.com/ossimlabs/omar-oms)

2. Git clone the following repos or git pull the latest versions if you already have them.
```
  git clone https://github.com/ossimlabs/omar-hibernate-spatial.git
  git clone https://github.com/ossimlabs/omar-jpip.git
```

3. Install omar-hibernate-spatial-plugin
```
 cd omar-jpip/plugins/omar-hibernate-spatial-plugin
 ./gradlew clean install
```

4. Install omar-jpip-plugin
```
 cd omar-jpip/plugin/omar-jpip-plugin
 ./gradlew clean install
```

5. Build/Install omar-jpip-app
#### Build:
```
 cd omar-jpip/apps/omar-jpip-app
 ./gradlew clean build
 ```
#### Install:
```
 cd omar-jpip/apps/omar-jpip-app
 ./gradlew clean install
```
