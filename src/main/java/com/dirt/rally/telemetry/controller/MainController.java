package com.dirt.rally.telemetry.controller;

import com.dirt.rally.telemetry.model.Packet;
import com.dirt.rally.telemetry.processor.PacketController;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private PacketController packetController = new PacketController(20777);

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Packet sendPacket() {
            return packetController.getPacket();
    }

}
