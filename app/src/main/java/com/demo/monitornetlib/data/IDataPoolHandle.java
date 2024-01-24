package com.demo.monitornetlib.data;

import java.util.HashMap;

public interface IDataPoolHandle {
    void initDataPool();
    void clearDataPool();
    void addNetworkFeedData(String key, NetworkFeedBean networkFeedModel);
    void removeNetworkFeedData(String key);
    HashMap<String, NetworkFeedBean> getNetworkFeedMap();
    NetworkFeedBean getNetworkFeedModel(String requestId);
    NetworkTraceBean getNetworkTraceModel(String id);
}
