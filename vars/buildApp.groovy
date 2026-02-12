def call() {
    echo "--- Stage 2: Building Application ---"
    sh "mvn clean package -DskipTests"
}
