
Oauth 2.0
---------

It is a protocol for conveying authorization

4 grant types authorization :
1. Authorization Code - (redirection)
2. Resource Owner Password Credentials - less secure and no redirection
3. Client Credentials
4. 

Advanced Token Options
----------------------
1. JDBC tokenstore for sclaing Auth servers
2. Token extensibility via tokenenhancer
3. OpenID connect for authentication and JWTs for encrypted tokens (to check *)

Method access rules
-------------------
PreAuthorize
- hasScope('READ'')
- hasAuthority ('ROLE_ADMIN'')

*** Build sample project



