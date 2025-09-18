# DemoApp6 - Java Servlet Login Application

This is a simple Java web application that demonstrates a basic user login functionality using Jakarta Servlets. The application presents a login form, validates user credentials against hardcoded values, and then either forwards the user to a profile page upon success or displays an error message upon failure.

## Features

-   User login page with username and password fields.
-   Server-side credential validation using a Java Servlet.
-   Use of `RequestDispatcher` to forward to a success page (`/profile`).
-   Use of `RequestDispatcher` to include the login page with an error message on failure.
-   A simple profile page to welcome the logged-in user.

## Technology Stack

-   **Backend:** Java, Jakarta Servlets API
-   **Frontend:** HTML
-   **Server:** Any Jakarta EE compatible servlet container (e.g., Apache Tomcat, Jetty)

## How It Works

The application flow is as follows:

1.  **Login Page:** The user is first directed to `index.html`, which contains a simple HTML form asking for a username and password.
2.  **Form Submission:** The form submits the credentials using the `POST` method to the `Login` servlet (mapped to `/login`).
3.  **Authentication:** The `Login` servlet retrieves the `username` and `password` from the request. It checks them against the hardcoded values:
    -   **Username:** `priyanshu`
    -   **Password:** `123`
4.  **Successful Login:** If the credentials match, the servlet sets the username as a request attribute (`user`) and forwards the request and response objects to the `Profile` servlet (mapped to `/profile`).
5.  **Profile Page:** The `Profile` servlet retrieves the `user` attribute from the request and displays a "Welcome to your profile, [username]" message.
6.  **Failed Login:** If the credentials do not match, the `Login` servlet prints an error message and then includes the `index.html` content back into the response, effectively re-rendering the login page with an error.

## Project Structure

```
DemoApp6
├── src/main/java
│   └── (default package)
│       ├── login.java      # Servlet for handling authentication
│       └── profile.java    # Servlet for the user profile page
└── src/main/webapp
    ├── WEB-INF
    │   └── web.xml         # Deployment Descriptor
    └── index.html          # The HTML login page
```

## How to Run

To run this project, you will need:

-   Java Development Kit (JDK) 8 or higher.
-   A servlet container like Apache Tomcat 10.x or higher.
-   An IDE like Eclipse or IntelliJ IDEA (optional, but recommended).

**Steps:**

1.  Clone or download this repository.
2.  Build the project into a WAR (Web Application Archive) file.
3.  Deploy the generated `.war` file to your Apache Tomcat (or other servlet container) `webapps` directory.
4.  Start the Tomcat server.
5.  Open your web browser and navigate to `http://localhost:8080/DemoApp6/` (the port and context path may vary depending on your server configuration).

## Test Credentials

Use the following credentials to log in:

-   **Username:** `priyanshu`
-   **Password:** `123`
