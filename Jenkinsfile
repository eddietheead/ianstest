pipeline {
agent any

stages {
  stage('build') {
    steps {
      // One or more stages need to be included within the stages block.
      dir("ianstest")
      echo 'building... 1 2 3'
      sh "mvnw site"
    }
  }
  stage('deploy') {
    steps {
      echo 'deploying... 1 2 3'
      // One or more steps need to be included within the steps block.
    }
  }
  stage('testing') {
    steps {
      echo 'testing... 1 2 3'
      // One or more steps need to be included within the steps block.
    }
  }

}
