// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from audio_record.djinni

package com.wireless.kernel.nativeinterface;

public final class UltraResult {


    /*package*/ long id;

    /*package*/ boolean hasMaxVal;

    /*package*/ boolean isExceedThre;

    /*package*/ float maxVal;

    public UltraResult(){}

    public UltraResult(
            long id,
            boolean hasMaxVal,
            boolean isExceedThre,
            float maxVal) {
        this.id = id;
        this.hasMaxVal = hasMaxVal;
        this.isExceedThre = isExceedThre;
        this.maxVal = maxVal;
    }

    public long getId() {
        return id;
    }

    public boolean getHasMaxVal() {
        return hasMaxVal;
    }

    public boolean getIsExceedThre() {
        return isExceedThre;
    }

    public float getMaxVal() {
        return maxVal;
    }

    @Override
    public String toString() {
        return "UltraResult{"
                + "id=" + id + ","
                + "hasMaxVal=" + hasMaxVal + ","
                + "isExceedThre=" + isExceedThre + ","
                + "maxVal=" + maxVal + ","
                + "}";
    }

}
