# Alexandria API

## To start the project
### Creating alexandriadb manually

Put db up
```bash
docker compose up -d
```
or
```bash
docker compose up -d
```

Get container name or id
```bash
docker container ls
```

Execute the docker container
```bash
docker exec -it <container_id_or_name> bash
```

Open Mysql
```bash
mysql -u root -p
```

Create database
```bash
CREATE DATABASE alexandriadb;
```

Verify that the database was created
```bash
SHOW DATABASES;
```

Exit the mysql
```bash
EXIT
```
