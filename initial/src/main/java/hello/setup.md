## Topics
https://spring.io/guides/gs/accessing-mongodb-data-rest/

- spring-data
    + page hierarchy
- spring-data-rest
- spring-data-mongodb
- mongodb

## Repository
Repository API changed in Spring Data 2.0

    https://jira.spring.io/browse/DATACMNS-944
    https://docs.spring.io/autorepo/docs/spring-data-commons/1.13.0.M1/api/org/springframework/data/repository/CrudRepository.html
    https://docs.spring.io/autorepo/docs/spring-data-commons/2.0.0.RC1/api/org/springframework/data/repository/CrudRepository.html

## Spring Data Commons
    
    https://docs.spring.io/spring-data/commons/docs/current/reference/html/

## PECS

    https://stackoverflow.com/questions/2723397/what-is-pecs-producer-extends-consumer-super
    
## Page hierarchy

    org.springframework.data.domain.Slice
    
### Install MongoDB

```
# https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/#install-mongodb-community-edition-with-homebrew
brew install mongodb
sudo mkdir -p /data/db
sudo chmod 775 /data/db
sudo dseditgroup -o edit -a qsbao -t user wheel
mongod
```

### Idea supports
https://blog.jetbrains.com/idea/2017/03/spring-data-improvements-in-intellij-idea-2017-1/

### Specify git username for github
```
vim ~/.gitconfig
[includeIf "gitdir:~/github/"]
    path = ~/github/.gitconfig

vim ~/github/.gitconfig
[user]
    email = qingsheng.bqs@gmail.com
    
```
