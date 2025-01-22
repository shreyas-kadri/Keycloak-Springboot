This is a simple project to demonstrate role based access to apis in springboot using keycloak as the identity provider.
We have created a realm in keycloak where we have a client named spring-app.This app has two roles,USER and ADMIN.
We have also created two users for this application one with ADMIN role and another with USER role.The admin api in the api is only accessible by
users with ADMIN role and the user api is accessible by users either ADMIN or USER role.
