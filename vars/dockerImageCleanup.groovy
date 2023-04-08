def call(String project, String ImageTag, String hubUser){
    sh """
     docker image rmi ${hubUser}/${project}:${ImageTag}
     docker image rmi ${hubUser}/${project}:latest
    """
}