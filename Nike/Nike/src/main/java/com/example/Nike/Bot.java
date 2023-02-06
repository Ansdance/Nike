//package com.example.Nike;
//import org.telegram.telegrambots.ApiContextInitializer;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.TelegramBotsApi;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
//import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
//import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Bot extends TelegramLongPollingBot {
//    public static void main(String[] args) {
//        ApiContextInitializer.init();
//        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
//        try {
//            telegramBotsApi.registerBot(new Bot());
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void onUpdateReceived(Update update) {
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            long chatId = update.getMessage().getChatId();
//            String messageText = update.getMessage().getText();
//            SendMessage message = new SendMessage().setChatId(chatId);
//
//            if (messageText.equals("/start")) {
//                message.setText("Welcome to the bot!");
//                setButtons(message);
//            } else {
//                message.setText("Unknown command, try again");
//                setButtons(message);
//            }
//
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public void setButtons(SendMessage sendMessage) {
//        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
//        sendMessage.setReplyMarkup(replyKeyboardMarkup);
//        replyKeyboardMarkup.setSelective(true);
//        replyKeyboardMarkup.setResizeKeyboard(true);
//        replyKeyboardMarkup.setOneTimeKeyboard(false);
//
//        List<KeyboardRow> keyboard = new ArrayList<>();
//
//        KeyboardRow keyboardFirstRow = new KeyboardRow();
//        keyboardFirstRow.add(new KeyboardButton("Option 1"));
//        keyboardFirstRow.add(new KeyboardButton("Option 2"));
//        keyboardFirstRow.add(new KeyboardButton("Option 3"));
//
//        keyboard.add(keyboardFirstRow);
//        replyKeyboardMarkup.setKeyboard(keyboard);
//    }
//
//    public String getBotUsername() {
//        return "MusicWasCreated_bot";
//    }
//
//    public String getBotToken() {
//        return System.getenv("5225538098:AAEg3uCG1zRk2x5ZJK8nlXl2MGv08qvLuJA");
//    }
//}