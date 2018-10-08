package com.cipl.customizedcamera;

import android.app.Activity;
import android.content.Intent;


public class Camera {

    public void openCamera(Activity activity) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        activity.startActivity(intent);
    }
}
