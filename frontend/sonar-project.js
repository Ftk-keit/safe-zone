const sonarqubeScanner = require("sonarqube-scanner");

sonarqubeScanner(
    {
        serverUrl: "http://localhost:9000",
        token: process.env.SONAR_TOKEN,
        options: {
            "sonar.projectKey": "app-frontend",
            "sonar.projectName": "app-frontend",
            "sonar.sources": "src",
            "sonar.exclusions": "**/*.spec.ts",
        },
    },
    () => process.exit()
).then(r =>
console.log("Scanner finished"));
