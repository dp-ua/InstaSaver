package com.dp_ua.InstaSaver.bot.command.impl;

import com.dp_ua.InstaSaver.bot.command.CommandInterface;
import com.dp_ua.InstaSaver.bot.message.Message;
import org.springframework.stereotype.Component;

@Component
public class CommandURL implements CommandInterface {
    @Override
    public String command() {
        return "CONTAINS_URL";
    }

    @Override
    public void execute(Message message) {

    }
}
