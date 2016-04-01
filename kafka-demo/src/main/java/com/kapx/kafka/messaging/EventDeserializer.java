package com.kapx.kafka.messaging;

import java.nio.ByteBuffer;
import java.util.Map;

import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Deserializer;

public class EventDeserializer implements Deserializer<Event> {

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
	}

	@Override
	public Event deserialize(String topic, byte[] data) {
		int id;
		int nameSize;
		String name;
		try {
			if (data == null)
				return null;
			if (data.length < 8)
				throw new SerializationException("Size of data received by IntegerDeserializer is shorter than expected");
			ByteBuffer buffer = ByteBuffer.wrap(data);
			id = buffer.getInt();
			nameSize = buffer.getInt();
			byte[] nameBytes = new byte[nameSize];
			buffer.get(nameBytes);
			name = new String(nameBytes, "UTF-8");
			return new Event(id, name);
		} catch (Exception e) {
			throw new SerializationException("Error when serializing Customer to byte[] " + e);
		}
	}

	@Override
	public void close() {
	}

}
