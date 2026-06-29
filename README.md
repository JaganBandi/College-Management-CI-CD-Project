# College-Management-CI-CD-Project

# College Management CI/CD Pipeline Project

## Project Overview

This project demonstrates an end-to-end CI/CD pipeline for a Java-based College Management web application using modern DevOps tools.

The pipeline automates the complete software delivery process from source code checkout to Docker image deployment.

---

## Technology Stack

* Git & GitHub
* Jenkins
* Maven
* Java 21
* SonarQube
* Nexus Repository
* Docker
* Docker Hub

---

## CI/CD Workflow

1. Source code is stored in GitHub.
2. Jenkins pulls the latest code.
3. Maven validates the project.
4. Maven compiles the application.
5. Maven executes unit tests.
6. SonarQube performs code quality analysis.
7. Maven packages the application into a WAR file.
8. WAR file is uploaded to Nexus Repository.
9. Docker builds an image using the WAR file.
10. Docker image is pushed to Docker Hub.
11. Jenkins sends build notification through email.

---

## Jenkins Pipeline Stages

* Checkout Code
* Validate
* Compile
* Test
* Package
* SonarQube Analysis
* Deploy to Nexus
* Build Docker Image
* Push Docker Image to Docker Hub
* Email Notification

---

## Project Structure

```
College-Management-CI-CD/
├── src/
├── pom.xml
├── Dockerfile
├── Jenkinsfile
├── .gitignore
└── README.md
```

---

## Maven Commands Used

```bash
mvn validate
mvn compile
mvn test
mvn clean package
mvn deploy
```

---

## Docker Commands Used

```bash
docker build -t college-management:v1 .
docker tag college-management:v1 <dockerhub-username>/college-management:v1
docker push <dockerhub-username>/college-management:v1
```

---

## Features

* Automated Build
* Automated Testing
* Static Code Analysis
* Artifact Management using Nexus
* Docker Image Creation
* Docker Hub Integration
* Email Notifications
* Fully Automated Jenkins Pipeline

---

## Future Enhancements

* Kubernetes Deployment
* ArgoCD Integration
* Terraform Infrastructure Automation
* Ansible Configuration Management

---

## Author

**Jagan Bandi**

