package edu.java.bot.command;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class StartCommand implements Command {
    private final String command = "/start";
    private final String description = "Start dialog";
    private final static String MESSAGE = "Hi, use /help to view the list of the available commands";
    private final UserRepository repository;

    @Override
    public SendMessage handle(Update update) {
        Long chatId = update.message().chat().id();
        repository.addUser(chatId);
        return new SendMessage(chatId, MESSAGE);
    }
}
