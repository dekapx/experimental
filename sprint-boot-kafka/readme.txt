-----------------------------------------------------------------
$ ./confluent start
$ ./kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic
$ ./kafka-topics --list --zookeeper localhost:2181
-----------------------------------------------------------------
- http://localhost:8080/api/ping
- http://localhost:8080/swagger-ui.html
-----------------------------------------------------------------
{
  "email": "dekapx@kapxinc.com",
  "firstName": "De",
  "lastName": "Kapx",
  "phone": "+1 1234567890"
}