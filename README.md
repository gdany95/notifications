# WORK IN PROGRESS

This service focuses on the persistence of notifications.

# Features
- Title, message
- Actions. The notification can have different actions. These are stored as JSON and the api is permissive. It is the responsibility of the sender and receiver to coordinate on the type of actions they support(eg: default, onClose, onRead, http get, post..)
- Send notification to all users
- Send notification to specific tenants
- Send notification to a specific user
- Send notification to a specific warehouse location
- Send notification to users with specific roles or authorities
- Mark notification as read when received
- Resend notification if not marked read

# Development
Prerequisites:
- Postgres. This service uses the `jsonb` data format, native to Postgres, for storing JSON, thus an embedded H2 database will not work.
- Dependencies: **ro.linic.util:commons**(these are added as Maven dependencies, but are not on Maven Central, so you will need to import the projects in your workspace and run `mvn install` to install them in your local maven repo)

Running:
1. Configure the Postgres datasource connection in application.yml
2. Start `master-authorizer`
3. Start the service as a normal Spring Boot app.
4. Use it as an OAuth2 Resource Server. You can check the api at http://localhost:8090/swagger-ui/index.html
