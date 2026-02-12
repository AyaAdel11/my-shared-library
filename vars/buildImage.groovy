def call(String imageName) {
    echo "--- Stage 3: Building Docker Image: ${imageName} ---"
    sh "docker build -t ${imageName} ."
}
