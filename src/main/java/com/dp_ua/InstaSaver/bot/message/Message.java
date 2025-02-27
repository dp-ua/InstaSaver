package com.dp_ua.InstaSaver.bot.message;

public interface Message {
    String getMessageText();

    String getChatId();

    String getUserId();

    Type getType();

    boolean hasCallbackQuery();

    String getCallBackQueryId();

    Integer getEditMessageId();

    String getUserName();

    boolean kickBot();

    enum Type {
        RECEIVE, SELF
    }
}
