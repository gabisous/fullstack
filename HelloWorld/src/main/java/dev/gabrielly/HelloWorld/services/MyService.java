package dev.gabrielly.HelloWorld.services;

import dev.gabrielly.HelloWorld.models.Device;

import java.util.List;

public interface MyService
{
   Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List<Device> getAllDevices();
}