package com.dirt.rally.telemetry.processor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver extends Thread {

    private static final int MAX_BUFFER = 2048;
    private int port;
    private PacketController packetController;

    public Receiver(int port, PacketController packetController) {
        this.port = port;
        this.packetController = packetController;
    }

    public void run() {
        try {
            DatagramSocket dsocket = new DatagramSocket(port);
            byte[] buffer = new byte[MAX_BUFFER];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("starting to receive");
            // Now loop forever, waiting to receive packets and printing them.
            while (true) {
                // Wait to receive a datagram
                dsocket.receive(packet);
                // Send contents to PacketController
                packetController.newPacket(buffer);
                // Reset the length of the packet before reusing it.
                packet.setLength(buffer.length);
            }
        } catch (IOException se) {
            se.printStackTrace();
        }
    }
}