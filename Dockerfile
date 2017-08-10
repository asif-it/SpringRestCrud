FROM artifactory.cobalt.com/java8

COPY target/cloud-platform-java-pattern-*.jar /opt/SpringRestCrud/SpringRestCrud.jar

EXPOSE 8080

# Tell registrator to send Consul the tag v1, which enables nginx routing.
LABEL SERVICE_TAGS=v1,api-gateway-internal

# Tell Consul (via registrator) how to health check the service.
LABEL SERVICE_8080_CHECK_SCRIPT="/opt/data/healthcheck/health_check.sh '\$SERVICE_PORT' health UP"

CMD ["java","-Xms256m","-Xmx256m","-jar","/opt/SpringRestCrud/SpringRestCrud.jar"]