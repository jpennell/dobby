package com.utl.dobby.script;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.utl.dobby.Dobby;
import com.utl.dobby.Script;

public class FlipCoin implements Script {
    
    private final static String COMMAND = "dobby flip coin";
    
    private final List<String> coin = Arrays.asList("Heads", "Tails");
    
    public void execute(final Dobby dobby) {
        if (COMMAND.equals(dobby.getMessage())) {
            final int choice = new Random().nextInt(this.coin.size());
            dobby.sendMessage(this.coin.get(choice));
        }
    }
    
    public String getHelpText() {
        return String.format("%s - Dobby will flip a coin for you.", COMMAND);
    }
}
