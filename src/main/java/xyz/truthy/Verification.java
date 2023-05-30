package xyz.truthy;

import net.dv8tion.jda.api.events.message.react.MessageReactionAddEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Verification extends ListenerAdapter {
    @Override
    public void onMessageReactionAdd(MessageReactionAddEvent event) {
        if (event.getMessageIdLong() == 1113180155855241306L) {
            System.out.println("Verified " + event.getUser().getAsTag());
            event.getGuild().addRoleToMember(event.getMember(), event.getGuild().getRoleById(1113173355433054228L)).queue();
        }
    }
}
