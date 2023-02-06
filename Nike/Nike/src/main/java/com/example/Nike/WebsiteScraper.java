//package com.example.Nike;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonObject;
//
//import com.google.gson.JsonParser;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//
//public class WebsiteScraper {
//    private static final String BASE_URL = "https://api.nike.com";
//    private static final String URI = "https://www.nike.com/w/mens-shoes-nik1zy7ok";
//    private static final OkHttpClient client = new OkHttpClient();
//    private static final Gson gson = new Gson();
//
//    private static List<JsonObject> getLazyProducts(String stub, List<JsonObject> products) throws IOException {
//        Request request = new Request.Builder().url(BASE_URL + stub).build();
//        Response response = client.newCall(request).execute();
//        String responseBody = response.body().string();
//
//        JsonObject responseJson = gson.fromJson(responseBody, JsonObject.class);
//        String nextProducts = responseJson.getAsJsonObject("pages").get("next").getAsString();
//        JsonParser parser = new JsonParser();
//        JsonArray jsonArray = (JsonArray) parser.parse(new FileReader(responseBody));
//        jsonArray.getAsJsonArray().get(0);
////        boolean objects = products.addAll(responseJson.getAsJsonArray("objects").getAsJsonArray());
//
//
//
//        for (int i = 0; i < jsonArray.size(); i++) {
//            JsonObject item = (JsonObject) jsonArray.get(i);
//            String groupName = item.get("Group Name").getAsString();
//            System.out.printf("%d group=%s%n", i, groupName); // item index and groupName
//        }
//
//
//        if (nextProducts != null && !nextProducts.isEmpty()) {
//            getLazyProducts(nextProducts, products);
//        }
//
//        return products;
//    }
//
//    public static void main(String[] args) throws IOException {
//        Request request = new Request.Builder().url(URI).build();
//        Response response = client.newCall(request).execute();
//        String responseBody = response.body().string();
//
//        Pattern pattern = Pattern.compile("window\\.INITIAL_REDUX_STATE=(\\{.*?\\});");
//        Matcher matcher = pattern.matcher(responseBody);
//        matcher.find();
//        JsonObject redux = gson.fromJson(matcher.group(1), JsonObject.class);
//
//        JsonObject wall = redux.getAsJsonObject("Wall");
//        String initialProducts = wall.getAsJsonObject("pageData").get("next").getAsString().replace("anchor=[0-9]+", "anchor=0");
//
//        List<JsonObject> products = getLazyProducts(initialProducts, new ArrayList<>());
//
//        Set<String> cloudProductIds = new HashSet<>();
//        List<JsonObject> uniqueProducts = new ArrayList<>();
//        for (JsonObject product : products) {
//            if (!cloudProductIds.contains(product.get("id").getAsString())) {
//                cloudProductIds.add(product.get("id").getAsString());
//                uniqueProducts.add(product);
//            }
//        }
//    }
//}