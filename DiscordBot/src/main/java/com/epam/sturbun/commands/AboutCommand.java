package com.epam.sturbun.commands;

import com.epam.sturbun.DiscordBot;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

/**
 * Команда возвращающая описание бота и его возможностей.
 */
public class AboutCommand implements Command {

    private DiscordBot bot;
    private String answer;
    private MessageChannel targetChannel;

    AboutCommand(DiscordBot bot){
        this.bot = bot;
    }

    @Override
    public void prepare(MessageReceivedEvent message) {
        answer = "Данный бот пишется в ходе ре-трининга";
        targetChannel = message.getChannel();
    }

    @Override
    public void execute() {
        targetChannel.sendMessage(answer).submit();
    }
}
