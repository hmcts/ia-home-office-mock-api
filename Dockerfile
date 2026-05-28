ARG APP_INSIGHTS_AGENT_VERSION=3.4.13

# Application image

FROM hmctsprod.azurecr.io/base/java:21-distroless

COPY lib/applicationinsights.json /opt/app/
COPY build/libs/ia-home-office-mock-api.jar /opt/app/

EXPOSE 8098
CMD [ "ia-home-office-mock-api.jar" ]
