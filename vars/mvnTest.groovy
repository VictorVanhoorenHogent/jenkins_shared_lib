def call (){
    sh 'env'
    sh 'cat /home/ubuntu/.docker/config.json'
    sh 'mvn test'
}