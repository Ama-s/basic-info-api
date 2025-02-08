Features
Returns user email, current UTC datetime, and GitHub repository URL.
JSON response format.
Deployed on Railway with a publicly accessible endpoint.


API Endpoint
Base URL: https://your-app-name.up.railway.app/
GET /getInfo – Retrieves the required JSON response
Response Format (200 OK)
{
  "email": "arkudeborah123@gmail.com",
  "current_datetime": "2025-02-08T12:00:00Z",
  "github_url": "https://github.com/Ama-s/basic-info-api"
}


Setup & Installation
1. Clone the Repository
git clone https://github.com/Ama-s/basic-info-api.git
cd basic-info-api
2. Configure & Run the App
Ensure you have Java and Maven installed, then run
mvn spring-boot:run


Deployment
This API is deployed on Railway. If you want to deploy it yourself:
Push the latest code to GitHub.
Deploy the repository on Railway.
Ensure the PORT environment variable is set dynamically.


Useful Links
Live API: https://your-app-name.up.railway.app/getInfo
GitHub Repo: https://github.com/Ama-s/basic-info-api
https://hng.tech/hire/java-developers
