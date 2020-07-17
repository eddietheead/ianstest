pipeline {
    agent any
    stages {
        stage('Build') {
            dir('ianstest')
            steps {
                echo 'Building... 1 2 3 using mvnw'
                sh './mvnw site'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing... 1 2 3'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying (at some point)... 1 2 3 4'
            }
        }
    }
}

