def call(String imageName) {
    echo "--- Stage 6: Cleaning up local image ---"
    sh "docker rmi ${imageName} --force || true"
}
