package com.utl.dobby.script;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.utl.dobby.Dobby;
import com.utl.dobby.Script;

public class Quote implements Script {
    
    private static final String COMMAND = "dobby quote";
    
    private final List<String> quotes = Arrays.asList("Dobby, sir. Just Dobby. Dobby the house-elf.",
            "Dobby has never been asked to sit down by a wizard -- like an equal --", "Bad Dobby! Bad Dobby!",
            "Dobby is used to death threats, sir. Dobby gets them five times a day at home.",
            "He said we is free to call him a - a barmy old codger if we likes, sir!",
            "They has made a mistake in the shop, Harry Potter, they is giving you two the same!");
    
    public void execute(final Dobby dobby) {
        
        if (COMMAND.equals(dobby.getMessage())) {
            final int choice = new Random().nextInt(this.quotes.size());
            dobby.sendMessage(this.quotes.get(choice));
        }
    }
    
    public String getHelpText() {
        return String.format("%s - Dobby will quote himself for you Sir!", COMMAND);
    }
    
}
