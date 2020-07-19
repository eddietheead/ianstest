pipeline {
agent any

stages {

  stage('1. Build') {
    steps {
      dir('ianstest') {
        sh("pwd")
        echo 'building... 1 2 3'
        sh 'mvnw site'
      }
    }
  }
  stage('2. Build') {
            steps {
                echo 'Hello World'
            }
        }
  stage('3. Deploy') {
            steps {
                echo 'Hello World'
            }
        }
  }
}
