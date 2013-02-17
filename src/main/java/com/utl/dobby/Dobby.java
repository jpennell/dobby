package com.utl.dobby;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.utl.dobby.data.Brain.BrainMessage;
import com.utl.dobby.data.Brain.BrainMessage.Builder;

public class Dobby {
    
    private final File brainFile;
    
    private final BrainMessage.Builder brain;
    
    private String message;
    
    public Dobby(final File brainFile) {
        super();
        this.brainFile = brainFile;
        this.brain = this.readBrain();
    }
    
    private Builder readBrain() {
        
        BrainMessage.Builder brain;
        
        try {
            final byte[] bytes = FileUtils.readFileToByteArray(this.brainFile);
            brain = BrainMessage.newBuilder().mergeFrom(bytes);
        } catch (final IOException e) {
            brain = BrainMessage.newBuilder();
        }
        
        return brain;
    }
    
    public BrainMessage.Builder getBrain() {
        return this.brain;
    }
    
    public void saveBrain() {
        
        try {
            FileUtils.writeByteArrayToFile(this.brainFile, this.brain.build().toByteArray());
        } catch (final IOException e) {
        }
        
    }
    
    public void printBrain() {
        System.out.println(this.brain.build().toString());
    }
    
    public void sendMessage(final String message) {
        System.out.println(message);
    }
    
    public void setMessage(final String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }
    
}
