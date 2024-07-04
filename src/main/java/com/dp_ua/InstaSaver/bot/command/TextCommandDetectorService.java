package com.dp_ua.InstaSaver.bot.command;

import com.dp_ua.InstaSaver.exception.NotForMeException;

import java.util.List;

public interface TextCommandDetectorService {
    List<CommandInterface> getParsedCommands(String text) throws NotForMeException;
}
