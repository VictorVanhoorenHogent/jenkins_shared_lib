def call(String Region, String AwsAccountId, String EcrRepo){
    sh """
     trivy image ${AwsAccountId}.dkr.ecr.${Region}.amazonaws.com/${EcrRepo}:latest > scan.txt
     cat scan.txt
    """
}