package com.dirt.rally.telemetry.model;

import java.math.BigDecimal;

public enum PacketEnum {
    TOTAL_TIME {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTotalTime(value);
        }
    },
    LAP_TIME {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLapTime(value);
        }
    },
    LAP_DISTANCE {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLapDistance(value);
        }
    },
    TOTAL_DISTANCE {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTotalDistance(value);
        }
    },
    POSITION_X {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setPositionX(value);
        }
    },
    POSITION_Y {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setPositionY(value);
        }
    },
    POSITION_Z {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setPositionZ(value);
        }
    },
    SPEED {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSpeed(value);
        }
    },
    VELOCITY_X {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setVelocityX(value);
        }
    },
    VELOCITY_Y {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setVelocityY(value);
        }
    },
    VELOCITY_Z {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setVelocityZ(value);
        }
    },
    LEFT_DIR_X {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLeftDirX(value);
        }
    },
    LEFT_DIR_Y {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLeftDirY(value);
        }
    },
    LEFT_DIR_Z {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLeftDirZ(value);
        }
    },
    FORWARD_DIR_X {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setForwardDirX(value);
        }
    },
    FORWARD_DIR_Y {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setForwardDirY(value);
        }
    },
    FORWARD_DIR_Z {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setForwardDirZ(value);
        }
    },
    SUSPENSION_POSITION_BL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionBl(value);
        }
    },
    SUSPENSION_POSITION_BR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionBr(value);
        }
    },
    SUSPENSION_POSITION_FL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionFl(value);
        }
    },
    SUSPENSION_POSITION_FR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionFr(value);
        }
    },
    SUSPENSION_VELOCITY_BL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionBl(value);
        }
    },
    SUSPENSION_VELOCITY_BR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionBr(value);
        }
    },
    SUSPENSION_VELOCITY_FL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionFl(value);
        }
    },
    SUSPENSION_VELOCITY_FR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSuspensionPositionFr(value);
        }
    },
    WHEEL_PATCH_SPEED_BL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setWheelPatchSpeedBl(value);
        }
    },
    WHEEL_PATCH_SPEED_BR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setWheelPatchSpeedBr(value);
        }
    },
    WHEEL_PATCH_SPEED_FL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setWheelPatchSpeedFl(value);
        }
    },
    WHEEL_PATCH_SPEED_FR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setWheelPatchSpeedFr(value);
        }
    },
    THROTTLE_INPUT {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setThrottleInput(value);
        }
    },
    STEERING_INPUT {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSteeringInput(value);
        }
    },
    BRAKE_INPUT {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setBrakeInput(value);
        }
    },
    CLUTCH_INPUT {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setClutchInput(value);
        }
    },
    GEAR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setGear(value);
        }
    },
    G_FORCE_LATERAL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setGForceLateral(value);
        }
    },
    G_FORCE_LONGITUDINAL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setGForceLongitudinal(value);
        }
    },
    LAP {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLap(value);
        }
    },
    ENGINE_RATE {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setEngineRate(value);
        }
    },
    NATIVE_SLI_SUPPORT {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setNativeSliSupport(value);
        }
    },
    RACE_POSITION {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setRacePosition(value);
        }
    },
    KERS_LEVEL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setKersLevel(value);
        }
    },
    KERS_LEVEL_MAX {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setKersLevelMax(value);
        }
    },
    DRS {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setDrs(value);
        }
    },
    TRACTION_CONTROL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTractionControl(value);
        }
    },
    ABS {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setAbs(value);
        }
    },
    FUEL_IN_TANK {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setFuelInTank(value);
        }
    },
    FUEL_CAPACITY {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setFuelCapacity(value);
        }
    },
    IN_PITS {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setInPits(value);
        }
    },
    RACE_SECTOR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setRaceSector(value);
        }
    },
    SECTOR_TIME1 {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSectorTime1(value);
        }
    },
    SECTOR_TIME2 {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setSectorTime2(value);
        }
    },
    BRAKE_TEMP_BL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setBrakeTempBl(value);
        }
    },
    BRAKE_TEMP_BR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setBrakeTempBr(value);
        }
    },
    BRAKE_TEMP_FL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setBrakeTempFl(value);
        }
    },
    BRAKE_TEMP_FR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setBrakeTempFr(value);
        }
    },
    TYRE_PRESSURE_BL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTyrePressureBl(value);
        }
    },
    TYRE_PRESSURE_BR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTyrePressureBr(value);
        }
    },
    TYRE_PRESSURE_FL {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTyrePressureFl(value);
        }
    },
    TYRE_PRESSURE_FR {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTyrePressureFr(value);
        }
    },
    LAPS_COMPLETED {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLapsCompleted(value);
        }
    },
    TOTAL_LAPS {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTotalLaps(value);
        }
    },
    TRACK_LENGTH {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTrackLength(value);
        }
    },
    LAST_LAP_TIME {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setLastLapTime(value);
        }
    },
    TEST1 {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTest1(value);
        }
    },
    TEST2 {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTest2(value);
        }
    },
    TEST3 {
        @Override
        public void setValue(Packet packet, BigDecimal value) {
            packet.setTest3(value);
        }
    };


    public abstract void setValue(Packet packet, BigDecimal value);
}