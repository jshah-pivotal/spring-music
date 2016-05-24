FROM java:8-jdk

# Export the dependencies directories as a volume
RUN mkdir -p /root/.gradle
VOLUME [ "/root/.gradle" ]

# Create working directory
RUN mkdir -p /code
VOLUME [ "/code" ]
WORKDIR /code

ENTRYPOINT [ "./gradlew" ]
