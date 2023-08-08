// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from audio_record.djinni

package com.wireless.kernel.nativeinterface;

public final class IniPosition {


    /*package*/ double iniX;

    /*package*/ double iniY;

    /*package*/ double iniZ;

    /*package*/ double angle;

    /*package*/ double dis;

    public IniPosition(){}

    public IniPosition(
            double iniX,
            double iniY,
            double iniZ,
            double angle,
            double dis) {
        this.iniX = iniX;
        this.iniY = iniY;
        this.iniZ = iniZ;
        this.angle = angle;
        this.dis = dis;
    }

    public double getIniX() {
        return iniX;
    }

    public double getIniY() {
        return iniY;
    }

    public double getIniZ() {
        return iniZ;
    }

    public double getAngle() {
        return angle;
    }

    public double getDis() {
        return dis;
    }

    @Override
    public String toString() {
        return "IniPosition{"
                + "iniX=" + iniX + ","
                + "iniY=" + iniY + ","
                + "iniZ=" + iniZ + ","
                + "angle=" + angle + ","
                + "dis=" + dis + ","
                + "}";
    }

}