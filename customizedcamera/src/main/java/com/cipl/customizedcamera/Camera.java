package com.cipl.customizedcamera;

import android.app.Activity;
import android.content.Intent;


public class Camera extends Activity {

    public void openCamera() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
}
