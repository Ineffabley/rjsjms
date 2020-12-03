package Flyweight15;

import java.util.ArrayList;

/**
 * @author ywq
 */
public class DeviceFactory {
    private ArrayList devices=new ArrayList();
    private int total=0;

    public DeviceFactory( ) {
        NetworkDevice nd1=new Switch("cisio-ws");
        devices.add(nd1);
        NetworkDevice nd2=new Hub("TP-LINK");
        devices.add(nd2);
    }

    public NetworkDevice getNetworkDevice(String type)
    {
        if(type.equalsIgnoreCase("cisco"))
        {
            total++;
            return (NetworkDevice)devices.get(0);
        }
        else if(type.equalsIgnoreCase("tp"))
    {
        total++;
        return (NetworkDevice)devices.get(1);
    }
        else return null;

    }

    public int getTotalDevice()
    {
        return devices.size();
    }


    public int getTotal()
    {
        return total;
    }
}
