package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;
import net.raymondjxu.ftc.dashboard.telemetry.TelemetryPacket;
import java.util.List;

public class ReceiveTelemetry extends Message {
    // an empty list tells clients to clear
    private List<TelemetryPacket> telemetry;

    public ReceiveTelemetry(List<TelemetryPacket> packets) {
        super(MessageType.RECEIVE_TELEMETRY);

        telemetry = packets;
    }
}
