FROM mcr.microsoft.com/devcontainers/java:17

RUN apt-get update && \
    apt-get install -y maven gradle curl && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

EXPOSE 8080
