package com.kapx.java.quickstart;

import com.kapx.java.common.model.MessageType;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamStringToPojo {
    public static void main(String[] args) {
        final String[] messages = {"Sync", "Async", "Reactive"};
        var messageTypes = toMessageType.apply(messages);
        messageTypes.stream().map(m -> m.getMessage()).forEach(print);
    }

    /**
     * Function accept String[], construct MessageType and return List.
     */
    private static Function<String[], List<MessageType>> toMessageType = (elements) ->
            Arrays.stream(elements)
            .map(MessageType::new)
                .collect(Collectors.toList());

    private static Consumer<String> print = (arg) -> {
        System.out.println(arg);
    };
}
