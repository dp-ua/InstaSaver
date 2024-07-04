package com.dp_ua.InstaSaver.bot.command;

import com.dp_ua.InstaSaver.bot.message.Message;

public class TestCommand implements CommandInterface {
    @Override
    public String command() {
        return "test";
    }

    @Override
    public void execute(Message message) {
        // do nothing
    }
}
