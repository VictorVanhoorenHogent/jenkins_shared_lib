def call (String AwsRegion, String EKSClusterName) {
    sh"""
        aws eks --region ${AwsRegion} update-kubeconfig --name ${EKSClusterName}
    """
}
