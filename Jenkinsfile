pipeline {
    agent any

    tools {
        jdk 'JDK'
        maven 'maven'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/JaganBandi/College_Management_Project.git'
            }
        }

        stage('Validate') {
            steps {
                sh 'mvn validate'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                    sh 'mvn sonar:sonar'
                }
            }
        }

        stage('Deploy to Nexus') {
            steps {
                sh 'mvn clean deploy'
            }
        }
    }

    post {

        success {
            emailext(
                subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
Build Successful

Project : ${env.JOB_NAME}
Build No: ${env.BUILD_NUMBER}
Status  : SUCCESS

Build URL:
${env.BUILD_URL}
""",
                to: 'jaganbandi06@gmail.com'
            )
        }

        failure {
            emailext(
                subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                body: """
Build Failed

Project : ${env.JOB_NAME}
Build No: ${env.BUILD_NUMBER}
Status  : FAILURE

Build URL:
${env.BUILD_URL}
""",
                to: 'jaganbandi06@gmail.com'
            )
        }
    }
}
