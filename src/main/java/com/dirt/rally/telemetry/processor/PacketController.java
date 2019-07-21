package com.dirt.rally.telemetry.processor;

import com.dirt.rally.telemetry.model.Packet;

public class PacketController {
    public Receiver receiver;
    private Packet packet;

    public PacketController(int port) {
        receiver = new Receiver(port, this);
        receiver.start();
    }

    public synchronized void newPacket(byte[] content) {
        packet = new Packet(content);
    }

    public Packet getPacket() {
        return packet;
    }
}