package edu.java.bot.command;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.repository.User;
import edu.java.bot.repository.UserRepository;
import java.util.List;
import lombok.Getter;
import org.springframework.stereotype.Component;


@Component
public class ListCommand implements Command {
    @Getter
    private final String command = "/list";
    @Getter
    private final String description = "Write tracking resources";

    private final UserRepository userRepository;

    public ListCommand(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public SendMessage handle(Update update) {
        Long chatId = update.message().chat().id();
        String message = getTrackLinks(chatId);
        return new SendMessage(chatId, message);
    }

    private String getTrackLinks(Long chatId) {
        User user = userRepository.getUser(chatId);
        List<String> trackLinks = user.getTrackLinks();
        StringBuilder message = new StringBuilder();
        if (trackLinks.isEmpty()) {
            message.append("You don't have tracking links. Use /track");
        } else {
            message.append("Tracking links:\n");
            for (String s : trackLinks) {
                message.append("- ").append(s).append("\n");
            }
        }
        return message.toString();
    }
}
