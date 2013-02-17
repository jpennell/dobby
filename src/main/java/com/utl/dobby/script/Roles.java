package com.utl.dobby.script;

import com.utl.dobby.Dobby;
import com.utl.dobby.Script;
import com.utl.dobby.data.Roles.RolesMessage;

public class Roles implements Script {
    
    private static final String COMMAND_PREFIX = "dobby roles";
    
    private static final String COMMAND = "dobby roles <person> [<role>]";
    
    @Override
    public void execute(final Dobby dobby) {
        
        try {
            if (dobby.getMessage().startsWith(COMMAND_PREFIX)) {
                
                final String text = dobby.getMessage().substring(12);
                final String[] elements = text.split(" ", 2);
                
                final String key = elements[0];
                String role = null;
                
                try {
                    role = elements[1];
                } catch (final Exception e) {
                }
                
                if (role != null) {
                    
                    boolean found = false;
                    
                    for (final RolesMessage.Builder builder : dobby.getBrain().getRolesBuilderList()) {
                        if (builder.getPerson().equals(key)) {
                            builder.addRoles(role);
                            found = true;
                            break;
                        }
                    }
                    
                    if (!found) {
                        final RolesMessage.Builder builder = RolesMessage.newBuilder().setPerson(key).addRoles(role);
                        dobby.getBrain().addRoles(builder.build());
                    }
                    
                    dobby.saveBrain();
                    System.out.println("I'll remember that for you Sir!");
                    
                } else {
                    
                    for (final RolesMessage roleMessage : dobby.getBrain().getRolesList()) {
                        if (roleMessage.getPerson().equals(key)) {
                            System.out.println(roleMessage.toString());
                            break;
                        }
                    }
                    
                }
            }
        } catch (final Exception e) {
            
        }
    }
    
    @Override
    public String getHelpText() {
        return String.format("%s - Assign someone a role and Dobby will remember.", COMMAND);
    }
    
}
