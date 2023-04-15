def call (String EKSClusterName) {
    sh"""
        aws eks update-kubeconfig --name ${EKSClusterName}
    """
}
