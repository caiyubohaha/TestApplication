package com.example.administrator.testapplication;

import android.content.Context;
import android.os.Environment;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.module.GlideModule;

import java.io.File;

/**
 * Created by Administrator on 2017/5/2.
 */

public class GlideCache implements GlideModule {
    @Override
    public void applyOptions(Context context, GlideBuilder glideBuilder) {
        glideBuilder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
        File storageDirectory = Environment.getExternalStorageDirectory();
        String downloadDirectoryPath=storageDirectory+"/GlideCache";
        int cacheSize = 100*1000*1000;

    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
