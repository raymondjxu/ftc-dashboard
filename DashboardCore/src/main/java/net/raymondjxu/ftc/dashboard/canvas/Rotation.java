package net.raymondjxu.ftc.dashboard.canvas;

public class Rotation extends CanvasOp {
    private double rotation;

    public Rotation(double radians) {
        super(Type.ROTATION);

        this.rotation = radians;
    }
}
