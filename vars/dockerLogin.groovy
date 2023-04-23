def call (String hubUser, String hubAccessToken ) {
    sh """
    echo ${hubAccesstoken} | docker login -u ${hubUser} --password-stdin
    """
}