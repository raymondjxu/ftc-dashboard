package net.raymondjxu.ftc.dashboard.canvas;

public class Polyline extends CanvasOp {
    private double[] xPoints;
    private double[] yPoints;

    public Polyline(double[] xPoints, double[] yPoints) {
        super(Type.POLYLINE);

        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }
}
