# RPC Protocol and data formats

## gRPC part (40 points)
* Create a simple gRPC server application that listens on port 8080 for a request like this (feel free to add more fields) 
<code>
{      
      "message": "Ping" 
}
</code>
* And responses with something like this (feel free to add more fields)
<code>
 {     
       "message": "Pong" 
}
</code>
* Create a simple Java gRPC client application that sends a request to the simple server (share the same proto file), gets a response, and prints it.
* Create a simple gRPC client application in any other language you like (or ask a trainer/lector for a Python example) that sends a request to the simple server, gets a response, and prints it. Use the same proto file.
* Start a server and try to communicate with it using the clients you just wrote.

## Avro part (60 points)
In this task, you need to create a Kafka producer and consumer using Avro to serialize messages.
* Create a simple Kafka producer that sends a simple message to a topic serializing it using Avro.
* Create a simple Kafka consumer which listens to a topic for a message, deserializes the message, and prints it.
* Start Kafka, create a topic, and run consumer and producer.
* Try to use different Avro schemas for serialization and deserialization. Observe that schema version/id has changed e.g. in schema registry and kafka message payload(bytes 1-4).



