FROM google/cloud-sdk:alpine

RUN apk add --update --no-cache openjdk8-jre && \
    gcloud components install cloud-datastore-emulator beta --quiet

ENV HOST 127.0.0.1
ENV PORT 8086
ENV PROJECT_ID stanby-log-analysis

VOLUME /opt/data

RUN gcloud config set project ${PROJECT_ID}

ENTRYPOINT ["gcloud", "beta", "emulators", "bigtable", "start", "--quiet"]
