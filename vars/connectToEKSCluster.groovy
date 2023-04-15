def call (String AwsRegion, String EKSClusterName) {
    sh"""
        aws eks update-kubeconfig --name ${EKSClusterName}
    """
}
