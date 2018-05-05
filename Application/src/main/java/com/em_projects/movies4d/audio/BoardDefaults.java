package com.em_projects.movies4d.audio;

import android.os.Build;

public class BoardDefaults {
    private static final String DEVICE_RPI3 = "rpi3";
    private static final String DEVICE_IMX6UL_PICO = "imx6ul_pico";
    private static final String DEVICE_IMX7D_PICO = "imx7d_pico";

    /**
     * Return the GPIO pin with a button that will trigger the Pairing command.
     */
    public static String getGPIOForPairing() {
        switch (Build.DEVICE) {
            case DEVICE_RPI3:
                return "BCM21";
            case DEVICE_IMX6UL_PICO:
                return "GPIO2_IO03";
            case DEVICE_IMX7D_PICO:
                return "GPIO6_IO14";
            default:
                throw new IllegalStateException("Unknown Build.DEVICE " + Build.DEVICE);
        }
    }

    /**
     * Return the GPIO pin with a button that will trigger the Disconnect All command.
     */
    public static String getGPIOForDisconnectAllBTDevices() {
        switch (Build.DEVICE) {
            case DEVICE_RPI3:
                return "BCM20";
            case DEVICE_IMX6UL_PICO:
                return "GPIO4_IO22";
            case DEVICE_IMX7D_PICO:
                return "GPIO6_IO15";
            default:
                throw new IllegalStateException("Unknown Build.DEVICE " + Build.DEVICE);
        }
    }

}
