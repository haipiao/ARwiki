package com.example.arbrowser;

import com.wikitude.common.camera.CameraSettings;

public class AutoHdSampleCamActivity extends SampleCamActivity {

    @Override
    public CameraSettings.CameraResolution getCameraResolution() {
        return CameraSettings.CameraResolution.AUTO;
    }
}
