package coma112.creports.enums.keys;

import coma112.creports.CReports;
import coma112.creports.processor.MessageProcessor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public enum MessageKeys {
    NO_PERMISSION("messages.no-permission"),
    RELOAD("messages.reload"),
    PLAYER_REQUIRED("messages.player-required"),
    FIRST_PAGE("messages.first-page"),
    LAST_PAGE("messages.last-page"),
    REPORT_RIGHT_USAGE("messages.report-right-usage"),
    CANT_REPORT_YOURSELF("messages.cant-report-yourself"),
    ADMIN_MESSAGE("messages.admin-message"),
    SUCCESSFUL_REPORT("messages.successful-report"),
    DEAD_PLAYER("messages.dead-player"),
    ALREADY_REPORTED("messages.already-reported"),
    HELP("messages.help"),
    OFFLINE_PLAYER("messages.player-is-offline");


    private final String path;

    MessageKeys(@NotNull String path) {
        this.path = path;
    }

    public String getMessage() {
        return MessageProcessor.process(CReports.getInstance().getLanguage().getString(path));
    }

    public List<String> getMessages() {
        return CReports.getInstance().getLanguage().getList(path)
                .stream()
                .map(MessageProcessor::process)
                .toList();
    }
}
