package com.dp_ua.InstaSaver.bot.command;

import com.dp_ua.InstaSaver.bot.message.Message;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface CommandInterface {
    String command();

    default List<String> altCommands() {
        return Collections.EMPTY_LIST;
    }

    default List<String> partOfStringCommands() {
        return Collections.EMPTY_LIST;
    }

    default List<String> fullStringCommands() {
        return Collections.EMPTY_LIST;
    }

    default List<String> allSimpleCommands() {
        return Stream
                .concat(
                        Stream.of(command()), altCommands().stream())
                .collect(Collectors.toList());
    }

    default String logString() {
        return "[" + getClass().getSimpleName() + "]:"
                + "{" + command() + "},"
                + "alt{" + altCommands() + "}";
    }

    void execute(Message message);
}
