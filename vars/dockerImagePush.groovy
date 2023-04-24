def call(String project, String ImageTag, String hubUser){
    sh """
     docker image push ${hubUser}/${project}:${ImageTag}
     docker image push ${hubUser}/${project}:latest
    """
}