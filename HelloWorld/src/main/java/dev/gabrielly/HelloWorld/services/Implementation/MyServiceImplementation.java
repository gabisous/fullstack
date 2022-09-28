package dev.gabrielly.HelloWorld.services.Implementation;

import dev.gabrielly.HelloWorld.models.Device;
import dev.gabrielly.HelloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyServiceImplementation implements MyService
{
    //MOCK BECAUSE WE DON'T HAVE DATABASE
    private final List<Device> myDevices = new ArrayList<>();

    @Override
    public Device save(Device device)
    {
        boolean contains = myDevices.contains(device);
        if (!contains) myDevices.add(device);
        return device;

//        myDevices.forEach(deviceFound ->
//        {
//            if(deviceFound.getMacAddress().equalsIgnoreCase(device.getMacAddress()))
//            {
//                throw new RuntimeException("Device Already Exits");
//            }
//        });
//        myDevices.add(device);
//        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress)
    {
        return null;
    }

    @Override
    public List<Device> getAllDevices()
    {
        return myDevices;
    }
}
