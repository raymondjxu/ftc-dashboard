package net.raymondjxu.ftc.dashboard.message.redux;

import net.raymondjxu.ftc.dashboard.RobotStatus;
import net.raymondjxu.ftc.dashboard.message.Message;
import net.raymondjxu.ftc.dashboard.message.MessageType;

public class ReceiveRobotStatus extends Message {
    private RobotStatus status;

    public ReceiveRobotStatus(RobotStatus robotStatus) {
        super(MessageType.RECEIVE_ROBOT_STATUS);

        status = robotStatus;
    }
}
