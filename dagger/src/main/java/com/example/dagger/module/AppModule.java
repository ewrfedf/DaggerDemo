package com.example.dagger.module;

import android.app.Application;

import com.example.dagger.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Zheng on 15/10/9.
 */

@Module(
        includes = {
                ToastModule.class
        }
)
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    public Application provideApplicationContext() {
        return app;
    }

}