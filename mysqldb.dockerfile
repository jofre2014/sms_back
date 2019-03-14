FROM mysql:5.7

# Copy the database initialize script: 
# Contents of /docker-entrypoint-initdb.d are run on mysqld startup
ADD mysql/ /docker-entrypoint-initdb.d/