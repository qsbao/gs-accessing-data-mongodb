## Topics
https://spring.io/guides/gs/accessing-mongodb-data-rest/

- spring-data
- spring-data-rest
- spring-data-mongodb
- mongodb

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
