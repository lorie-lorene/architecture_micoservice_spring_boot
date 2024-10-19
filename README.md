# architecture_micoservice_spring_boot
mise en place d'une simulation de banking service 
demmarage de rabbitmq sur docker
  sudo docker run --hostname rabbitmq --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management

Demarage des service du work shop:
1-congfig:
/usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_8lovkrl28k3hdbig3mk7mgnrs.argfile com.m1_fonda.service_config.ServiceConfigApplication 

2-register:
 /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_bw38jit7vjcqixmvtjw477o3u.argfile com.m1_fonda.service_register.ServiceRegisterApplication 

3-user:
 /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_elrb2phjgcmzegkny2ukvaeid.argfile com.m1_fonda.service_users.ServiceUsersApplication 

4-proxy:

demmarage de rabbit :
sudo systemctl stop rabbitmq-server.service 
sudo systemctl start rabbitmq-server.service 

information sur les donnees de config localhost:
ifconfig

# en cas de non activation du servcie rabbitmq
il est necessaire de prendre une dependance jumelle
*** quitter de la 
 <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-amqp</artifactId>
</dependency> 

 *** vers la 

 
<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-bus-amqp</artifactId>
</dependency>


 #### ****installation de l'executable 
 mvn install
 java -jar service-users-0.0.1-SNAPSHOT.jar
