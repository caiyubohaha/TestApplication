package com.example.administrator.testapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
       /* String filPath = Environment.getExternalStorageDirectory() + "/sxxaaaa.jpg";
        Log.i("8888",filPath);*/
                    /*Glide.with(this).load("http://test.files.superwallet.com.cn/user_files/10000004/LOGO_8610.jpg").asBitmap().centerCrop().dontAnimate().placeholder(R.mipmap.ic_launcher) //设置占位图
                            .error(R.mipmap.ic_launcher).diskCacheStrategy(DiskCacheStrategy.ALL).into(iv);
            */
    }


    public static void savePicture2SDcard(Bitmap bmp, File file) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        FileOutputStream fis = null;
        bmp.compress(Bitmap.CompressFormat.PNG, 100, baos);
        try {
            fis = new FileOutputStream(file);
            fis.write(baos.toByteArray());
            fis.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != baos) {
                    baos.close();
                }
                if (null != fis) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



}
