## Task: Migrate 'kitchensink' JBoss Application to Spring Boot

The task at hand is to migrate the 'kitchensink' application, currently running on JBoss with Java 11, to Spring Boot based on Java 21. Before diving into the migration, it's important to understand the current state of the application. This involves ensuring the application can execute successfully in its current state, with particular attention to handling JBoss, specifically jboss-eap-8.0.

Once the application's current state is understood and it's confirmed to be running successfully, the next step is to plan the move. Spring Boot is chosen as the target platform due to its maturity, higher chance of library/feature compatibility, and the strong backing by Pivotal, ensuring its long-term viability.

The migration process begins with setting up a basic 'Hello World' application on Spring Boot, following the Spring quickstart guide. This helps in understanding the new platform and sets the stage for the actual migration.

Next, the application layers are identified, focusing on the use-case abstraction in the source code. The 'kitchensink' application has a "member registration" feature with REST endpoints for each member, and there is an endpoint that lists all members. These are features which will need to be replicated in the new platform.

During the conversion, it's noted that there is no server-side validation of the data being persisted, which is a technical debt that needs to be addressed. The code is then refactored step by step, ensuring each feature works as expected on the new platform.

### Step 1: Define the Problem
Migrate the legacy JBoss application, 'kitchensink', to a more modern platform. The target runtime is the latest stable version of Spring Boot or Quarkus based on Java 21.

### Step 2: Understand the Current State
The application is currently running on JBoss with Java 11. Before starting the migration, ensure the application can execute successfully.

#### Build and Deploy
Use the following commands to build and deploy the application:

- `$ mvn clean package` for building the application.
- `$ mvn wildfly:deploy` for deploying the application.

#### Tests
Ensure all tests are passing before starting the migration.

### Step 3: Plan the Move
Consider the following factors when choosing between Quarkus and Spring Boot:

- Familiarity: If you or your team are already familiar with Spring and its ecosystem, Spring Boot might be the easier choice because it builds on the same concepts and libraries.
- Startup time and memory footprint: Quarkus is designed to have a very fast startup time and low memory footprint, which can be an advantage in environments like serverless computing where applications need to start quickly.
- Compatibility: Spring Boot has been around for a while and has a large ecosystem of compatible libraries and tools. If your application relies on specific libraries, they might be more likely to be compatible with Spring Boot.
- Long-term maintenance: Spring Boot is backed by Pivotal (a division of VMware), and has a large community and a long track record, which might give some assurance about its long-term viability. Quarkus, while backed by Red Hat, is newer and doesn't have as long a track record yet.

Based on these factors, Spring Boot is chosen due to its maturity and higher chance of library/feature compatibility.

### Step 4: Start the Migration
Follow the path to 'Hello World' on the target version using the Spring [quickstart guide](https://spring.io/quickstart). Use the following commands:

- `mvn clean package` to build the application.
- `mvn spring-boot:run` to run the application.

### Step 5: Identify Application Layers
Identify the use-case abstraction in the source code. The application has a "member registration" feature with 3 fields: name, email, and phone. There are REST endpoints for each member.

### Step 6: A bit of compromise (tech debt)
As you begin the conversion, note that there is no server-side validation of the data that is being persisted. This is a technical debt that needs to be addressed in the future.

### Step 7: Refactor Code
Grab all code and refactor it step by step.

### Step 8: Address Data Layer Mismatch (make it modern)
Source used H2 embedded data layer. (sql == 😔)
Target uses MongoDB data layer. (mongodb == 😎)

### Step 9: Implement MongoDB
Implement MongoDB in the Spring application.

### Step 10: Clone Website
Ensure the user experience (UX) is correct.

### Step 11: Confirm Functionality
Confirm that all features work as expected.

