package com.deni.basketball.recordtrain;

import android.accessibilityservice.AccessibilityService;
import android.graphics.PixelFormat;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/**
 * Created by deni on 2018/1/17.
 */

public class TrainAccessibility extends AccessibilityService {

        private static final String TAG = "TrainAccessibility";

        FrameLayout mLayout;

        @Override
        public void onAccessibilityEvent(AccessibilityEvent event) {
                Log.i(TAG,"onAccessibilityEvent"+event.toString());
        }

        @Override
        public void onInterrupt() {

        }


        @Override
        public boolean onKeyEvent(KeyEvent event) {
            int action = event.getAction();
            int keyCode = event.getKeyCode();
            if (action == KeyEvent.ACTION_UP) {
                if (keyCode == KeyEvent.KEYCODE_VOLUME_UP) {
                    Log.d("Hello", "KeyUp");
                } else if (keyCode == KeyEvent.KEYCODE_VOLUME_DOWN) {
                    Log.d("Hello", "KeyDown");
                }
                return true;
            } else {
                return super.onKeyEvent(event);
            }
        }

}
