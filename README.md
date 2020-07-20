# mybatis.jwt
# This project just an example of how to configure rest api with: 
  - Spring Boot 
  - Mybatis framework
  - JWT Authentication.
  - Swagger Api document assistance.
# Project configure 
  - For The database backup it already in resource/database-backup (for postgres SQl)
  - If you you are using another database server
    This is schema for you. 
      + user_info
        - id primary key
        - username varchar
        - password varchar
        - fullname varchar
      + blog
        - id primary key
        - title
        - content
        
 # For those whose you using our backup database 
    Here is exsiting user that you can requesting jWt auth token
    - password : 12345678
    - username : testing@gmail.com
    
 Any problem released to this matter please let me in the comment section. 
