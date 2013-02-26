package com.utl.dobby.script;

import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.utl.dobby.Dobby;
import com.utl.dobby.Script;

public class Stocks implements Script {
    
    private final static String COMMAND_PREFIX = "dobby stocks";
    
    private static final String COMMAND = "dobby stocks <symbol>[,<symbol>,<symbol>...]";
    
    @Override
    public void execute(final Dobby dobby) {
        if (dobby.getMessage().startsWith(COMMAND_PREFIX)) {
            
            final String text = dobby.getMessage().substring(13);
            final List<String> symbols = Arrays.asList(text.split("\\s*,\\s*"));
            
            final Client client = Client.create();
            
            for (final String symbol : symbols) {
                final WebResource resource = client.resource("http://finance.google.com/finance/info?client=ig&q="
                        + symbol);
                try {
                    
                    final String payload = resource.get(String.class).replaceAll("//", "");
                    
                    final JsonArray array = new JsonParser().parse(payload).getAsJsonArray();
                    final FinanceResponse response = new Gson().fromJson(array.get(0), FinanceResponse.class);
                    System.out.println(String.format("%s:%s - $%s", response.e, response.t, response.l_cur));
                    
                } catch (final Exception e) {
                }
            }
        }
    }
    
    @Override
    public String getHelpText() {
        return String.format("%s - Dobby will get stock prices for you.", COMMAND);
    }
    
    public class FinanceResponse {
        public String l_cur;
        public String e;
        public String t;
    }
    
}
