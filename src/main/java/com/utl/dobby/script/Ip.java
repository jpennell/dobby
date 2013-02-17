package com.utl.dobby.script;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

import com.utl.dobby.Dobby;
import com.utl.dobby.Script;

public class Ip implements Script {
    
    private static final String COMMAND = "dobby ip";
    
    @Override
    public void execute(final Dobby dobby) {
        if (COMMAND.equals(dobby.getMessage())) {
            this.printIp();
        }
    }
    
    private void printIp() {
        try {
            final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            
            while (interfaces.hasMoreElements()) {
                
                final NetworkInterface iface = interfaces.nextElement();
                
                if (iface.isLoopback() || !iface.isUp()) {
                    continue;
                }
                
                final Enumeration<InetAddress> addresses = iface.getInetAddresses();
                
                while (addresses.hasMoreElements()) {
                    
                    final InetAddress addr = addresses.nextElement();
                    
                    if (addr instanceof Inet6Address) {
                        continue;
                    }
                    
                    try {
                        if (!addr.isReachable(3000)) {
                            continue;
                        }
                    } catch (final Exception e) {
                        continue;
                    }
                    
                    final String ip = addr.getHostAddress();
                    System.out.println(iface.getDisplayName() + " " + ip);
                }
            }
            
        } catch (final IOException e) {
        }
    }
    
    @Override
    public String getHelpText() {
        return String.format("%s - Dobby will find your ip address for you", COMMAND);
    }
    
}
