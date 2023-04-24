def call(String project, String ImageTag, String hubUser){
    sh """
     trivy --no-progress --exit-code 1 --severity HIGH,CRITICAL ${hubUser}/${project}:latest > scan.txt
     cat scan.txt
    """
}