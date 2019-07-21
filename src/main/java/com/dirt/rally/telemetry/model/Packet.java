package com.dirt.rally.telemetry.model;

import lombok.Data;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@Data
public class Packet {
    private BigDecimal totalTime;
    private BigDecimal lapTime;
    private BigDecimal lapDistance;
    private BigDecimal totalDistance;
    private BigDecimal positionX;
    private BigDecimal positionY;
    private BigDecimal positionZ;
    private BigDecimal speed;
    private BigDecimal velocityX;
    private BigDecimal velocityY;
    private BigDecimal velocityZ;
    private BigDecimal leftDirX;
    private BigDecimal leftDirY;
    private BigDecimal leftDirZ;
    private BigDecimal forwardDirX;
    private BigDecimal forwardDirY;
    private BigDecimal forwardDirZ;
    private BigDecimal suspensionPositionBl;
    private BigDecimal suspensionPositionBr;
    private BigDecimal suspensionPositionFl;
    private BigDecimal suspensionPositionFr;
    private BigDecimal suspensionVelocityBl;
    private BigDecimal suspensionVelocityBr;
    private BigDecimal suspensionVelocityFl;
    private BigDecimal suspensionVelocityFr;
    private BigDecimal wheelPatchSpeedBl;
    private BigDecimal wheelPatchSpeedBr;
    private BigDecimal wheelPatchSpeedFl;
    private BigDecimal wheelPatchSpeedFr;
    private BigDecimal throttleInput;
    private BigDecimal steeringInput;
    private BigDecimal brakeInput;
    private BigDecimal clutchInput;
    private BigDecimal gear;
    private BigDecimal gForceLateral;
    private BigDecimal gForceLongitudinal;
    private BigDecimal lap;
    private BigDecimal engineRate;
    private BigDecimal nativeSliSupport;
    private BigDecimal racePosition;
    private BigDecimal kersLevel;
    private BigDecimal kersLevelMax;
    private BigDecimal drs;
    private BigDecimal tractionControl;
    private BigDecimal abs;
    private BigDecimal fuelInTank;
    private BigDecimal fuelCapacity;
    private BigDecimal inPits;
    private BigDecimal raceSector;
    private BigDecimal sectorTime1;
    private BigDecimal sectorTime2;
    private BigDecimal brakeTempBl;
    private BigDecimal brakeTempBr;
    private BigDecimal brakeTempFl;
    private BigDecimal brakeTempFr;
    private BigDecimal tyrePressureBl;
    private BigDecimal tyrePressureBr;
    private BigDecimal tyrePressureFl;
    private BigDecimal tyrePressureFr;
    private BigDecimal lapsCompleted;
    private BigDecimal totalLaps;
    private BigDecimal trackLength;
    private BigDecimal lastLapTime;
    private BigDecimal test1;
    private BigDecimal test2;
    //Race type - 5 for time trial, 6 for race
    private BigDecimal test3;

    public Packet(byte[] content) {

        ByteBuffer bb = ByteBuffer.wrap(content);
        bb.order(ByteOrder.LITTLE_ENDIAN);

        for (PacketEnum packetEnum : PacketEnum.values()) {
            packetEnum.setValue(this, BigDecimal.valueOf(bb.getFloat()));
        }
    }
}
