$ ./confluent start
$ ./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic
$ ./kafka-topics --list --zookeeper localhost:2181