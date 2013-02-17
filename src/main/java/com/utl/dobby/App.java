package com.utl.dobby;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.reflections.Reflections;

public class App {
    
    private static final String BRAIN_FILE = "brain.dat";
    
    private final Dobby dobby;
    
    public App() {
        final File dataFile = new File(BRAIN_FILE);
        this.dobby = new Dobby(dataFile);
    }
    
    public void run() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        
        Scanner scanner = null;
        
        try {
            
            scanner = new Scanner(System.in);
            System.out.println("Dobby, sir. Just Dobby. Dobby the house-elf.");
            System.out.print("> ");
            
            final Reflections reflections = new Reflections("com.utl.dobby.script");
            final Set<Class<? extends Script>> types = reflections.getSubTypesOf(Script.class);
            final List<Script> scripts = new ArrayList<Script>();
            
            for (final Class<? extends Script> type : types) {
                final Constructor<?> ctor = type.getConstructor();
                final Script script = (Script) ctor.newInstance(new Object[] {});
                scripts.add(script);
            }
            
            while (scanner.hasNext()) {
                
                final String input = scanner.nextLine();
                
                this.dobby.setMessage(input);
                
                if ("exit".equals(input)) {
                    break;
                } else if ("help".equals(input)) {
                    
                    System.out.println("\nHere are the commands that Dobby understands:");
                    
                    System.out.println("\texit - Leave Dobby all alone");
                    System.out.println("\thelp - Print out the commands that Dobby understands");
                    System.out.println("\tdobby brain - Print out Dobby's brain");
                    
                    for (final Script script : scripts) {
                        System.out.println(String.format("\t%s", script.getHelpText()));
                    }
                    
                } else if ("dobby brain".equals(input)) {
                    this.dobby.printBrain();
                } else {
                    for (final Script script : scripts) {
                        script.execute(this.dobby);
                    }
                }
                
                System.out.print("> ");
            }
            
        } finally {
            if (scanner != null) {
                scanner.close();
                scanner = null;
            }
        }
        
        System.out.println("Goodbye!");
        
    }
    
    public static void main(final String[] args) throws NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        
        new App().run();
        
    }
    
}
