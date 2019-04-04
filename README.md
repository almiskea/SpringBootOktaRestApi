to call the application endpoint

with

http://localhost:8080/name/{name}

with 
header {
Authorization:Bearer eyJraWQiOiJpOTZ...
}

where {name} is any string you choose
you get an authorization token
by calling

https://dev-115058.okta.com/oauth2/default/v1/token?grant_type=client_credentials&scope={created scope}

header : {
    Authorization:Basic MG9hZXc.....==
    Content-Type:application/x-www-form-urlencoded
}

where {created scope} is a scope you created in Okta
you can make the authorization header with this website 

https://www.blitter.se/utils/basic-authentication-header-generator/


Then you use user client_id as username, secret_key, as password to get the right Basic authorization to get the token

