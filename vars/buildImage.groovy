def call(String imageName) {
    echo "--- Stage 3: Building Docker Image: ${imageName} ---"
    sh "docker rmi ${IMAGE_NAME}:latest || true"
    sh "docker tag ${IMAGE_NAME}:${IMAGE_TAG} ${IMAGE_NAME}:latest"
}
