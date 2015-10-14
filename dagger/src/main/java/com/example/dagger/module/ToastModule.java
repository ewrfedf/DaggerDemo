package com.example.dagger.module;

import android.app.Application;
import android.widget.Toast;

import com.example.dagger.App;
import com.example.dagger.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Zheng on 15/10/12.
 */

@Module(
        injects = {
                App.class,
                MainActivity.class
        },
        complete = false, library = true)
public class ToastModule {
    @Provides
    @Singleton
    public Toast provideToast(Application application) {
        return Toast.makeText(application, "", Toast.LENGTH_SHORT);
    }
}
