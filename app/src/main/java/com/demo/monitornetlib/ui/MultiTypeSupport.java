package com.demo.monitornetlib.ui;

import java.util.List;


public interface MultiTypeSupport<T> {

    int getLayoutId(List<T> data, int position);

}
