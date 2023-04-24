def call(String project, String ImageTag, String hubUser){
    sh """
     trivy image --no-progress --format template --template "@/home/ubuntu/html.tpl" -o cve_report.html --exit-code 1 --severity HIGH,CRITICAL ${hubUser}/${project}:latest
    """
}