
node {
  stage('SCM') {
    checkout scm
  }
  stage('SonarQube Analysis') {
    def mvn = tool 'practica4maven';
    withSonarQubeEnv() {
      sh "${mvn}/bin/mvn clean verify sonar:sonar -Dsonar.projectKey=practica4calidad"
    }
  }
}
pipeline {
    agent any
    stages {
        stage('git repo & clean') {
            steps {
               bat "rmdir  /s /q calidadpractica
"
                bat "git clone https://github.com/javistp/calidadpractica.git"
                bat "mvn clean -f calidadpractica"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f calidadpractica"
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f calidadpractica"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f calidadpractica"
            }
        }
    }
}
