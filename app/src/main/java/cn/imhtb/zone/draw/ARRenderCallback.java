
package cn.imhtb.zone.draw;

import android.graphics.SurfaceTexture;


public interface ARRenderCallback {
    void onCameraDrawerCreated(SurfaceTexture surfaceTexture, int width, int height);

    void onARDrawerCreated(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener
            arFrameListener, int width, int height);

    void onARDrawerChanged(SurfaceTexture surfaceTexture, int width, int height);
}