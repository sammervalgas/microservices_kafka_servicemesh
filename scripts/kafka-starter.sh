#/bin/bash

HOST_ZOOKEEPER='localhost:2181'
HOST_KAFTA='localhost:9092'

./zookeeper-server-start.sh ../config/zookeeper.properties &
sleep 5

./kafka-server-start.sh ../config/server.properties &
 sleep 10 

./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic meutopico

./kafka-topics.sh --list --zookeeper localhost:2181

# --> Produzindo mensagem
#./kafka-console-producer.sh --broker-list  --topic meutopico

# --> Consumindo mensagem
#./kafka-console-consumer.sh --bootstrap-server  --topic meutopico --from-beginning
