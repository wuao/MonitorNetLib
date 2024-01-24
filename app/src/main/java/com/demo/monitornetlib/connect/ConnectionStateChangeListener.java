package com.demo.monitornetlib.connect;

public interface ConnectionStateChangeListener {
    void onBandwidthStateChange(ConnectionQuality bandwidthState);
}
