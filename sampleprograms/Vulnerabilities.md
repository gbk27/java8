CROSS-SITE SCRIPTING (XSS)
--------------------------

Cross-Site Scripting (also known as XSS) is one of the most common application-layer web attacks. XSS vulnerabilities target scripts embedded in a page that are executed on the client-side (in the user’s web browser) rather than on the server-side. 
XSS in itself is a threat that is brought about by the internet security weaknesses of client-side scripting languages, such as HTML and JavaScript. 
The concept of XSS is to manipulate client-side scripts of a web application to execute in the manner desired by the malicious user. 
Such a manipulation can embed a script in a page that can be executed every time the page is loaded, or whenever an associated event is performed.


Key Concepts of XSS
XSS is a web-based attack performed on vulnerable web applications.
In XSS attacks, the victim is the user and not the application.
In XSS attacks, malicious content is delivered to users using JavaScript.

 3 types

    Reflected XSS, where the malicious script comes from the current HTTP request.
    Stored XSS, where the malicious script comes from the website's database.
    DOM-based XSS, where the vulnerability exists in client-side code rather than server-side code.

 
 The attacker may:
 
     gain access to users cookies, session IDs, passwords, private messages, etc
     read and access the content of a page for any attacked user and therefore all the information displayed to the user
     compromise the content shown to the user
     
     
* How to prevent XSS attacks

Preventing cross-site scripting is trivial in some cases but can be much harder depending on the complexity of the application and the ways it handles user-controllable data.

In general, effectively preventing XSS vulnerabilities is likely to involve a combination of the following measures:

    Filter input on arrival. At the point where user input is received, filter as strictly as possible based on what is expected or valid input.
    Encode data on output. At the point where user-controllable data is output in HTTP responses, encode the output to prevent it from being interpreted as active content. Depending on the output context, this might require applying combinations of HTML, URL, JavaScript, and CSS encoding.
    Use appropriate response headers. To prevent XSS in HTTP responses that aren't intended to contain any HTML or JavaScript, you can use the Content-Type and X-Content-Type-Options headers to ensure that browsers interpret the responses in the way you intend.
    Content Security Policy. As a last line of defense, you can use Content Security Policy (CSP) to reduce the severity of any XSS vulnerabilities that still occur.

     
 
* Common questions about cross-site scripting
 
 How common are XSS vulnerabilities? XSS vulnerabilities are very common, and XSS is probably the most frequently occurring web security vulnerability.
 
 How common are XSS attacks? It is difficult to get reliable data about real-world XSS attacks, but it is probably less frequently exploited than other vulnerabilities.
 
 What is the difference between XSS and CSRF? XSS involves causing a web site to return malicious JavaScript, while CSRF involves inducing a victim user to perform actions they do not intend to do.
 
 What is the difference between XSS and SQL injection? XSS is a client-side vulnerability that targets other application users, while SQL injection is a server-side vulnerability that targets the application's database.
 
 How do I prevent XSS in PHP? Filter your inputs with a whitelist of allowed characters and use type hints or type casting. Escape your outputs with htmlentities and ENT_QUOTES for HTML contexts, or JavaScript Unicode escapes for JavaScript contexts.
 
 How do I prevent XSS in Java? Filter your inputs with a whitelist of allowed characters and use a library such as Google Guava to HTML-encode your output for HTML contexts, or use JavaScript Unicode escapes for JavaScript contexts.
 
 
 
SQL INJECTION
--------------


https://bankingwebsite/show_balances?user_id=984
query - SELECT accountNumber, balance FROM accounts WHERE account_owner_id = 984


The attacker could change the parameter “user_id” to be interpreted as: 0 OR 1=1
SELECT accountNumber, balance FROM accounts WHERE account_owner_id = 0 OR 1=1

it will return all the account numbers and balances it has stored, and rows are added to the page to show them
 
* Fix
The developer could easily repair this vulnerability by using a prepared statement to create a parameterized query

You can prevent SQL Injection attacks by using the following practices:

Use prepared statements
Use Stored Procedures
Validate user input



Cross Site Request Forgery (CSRF)
--------------------------------

Cross-Site Request Forgery (CSRF) is a type of attack that occurs when a malicious web site, email, blog, instant message, or program causes a user's web browser to perform an unwanted action on a trusted site when the user is authenticated

An example of a CSRF attack is if a victim were to log in to their banking website and while their session is active, they receive an email with a request to click on a link. 
If this victim clicks the link, a script would execute against the banking site to transfer funds from their account into one the attacker has designated. 
Here, the attacker has impersonated the victim by using the victim’s login information, computer and IP address for the attack.

Preventing Cross-Site Request Forgery Attacks  
 - Primary Defense Technique
    This defense is one of the most popular and recommended methods to mitigate CSRF. It can be achieved either with state (synchronizer token pattern) or stateless (encrypted/hash based token pattern).
    
    
Defense In Depth Techniques
 - Use the Same-Site Flag in Cookies
 - Verifying origin with standard headers



