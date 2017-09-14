package com.bogdevich.cafe.util;

import java.util.Locale;
import java.util.ResourceBundle;

public final class MessageManager {

    private static class MessageManagerHolder {
        private static final MessageManager MESSAGE_MANAGER = new MessageManager();
    }

    private final String BASE_NAME = "message";

    private MessageManager() {
    }

    public static MessageManager getInstance() {
        return MessageManagerHolder.MESSAGE_MANAGER;
    }

    /**
     *
     * @param key
     * @param languageTag
     * @return
     */
    public String getMessage(String key, String languageTag) {
        return ResourceBundle
                .getBundle(BASE_NAME, Locale.forLanguageTag(languageTag))
                .getString(key);
    }
}
