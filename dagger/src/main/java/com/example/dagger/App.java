package com.example.dagger;

import android.app.Application;
import android.widget.Toast;

import com.example.dagger.module.AppModule;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import dagger.ObjectGraph;

/**
 * Created by Zheng on 15/10/9.
 */
public class App extends Application {

    private ObjectGraph applicationGraph;

    @Inject
    Toast toast;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationGraph = ObjectGraph.create(getModules().toArray());
        applicationGraph.inject(this);
        toast.setText("hello dagger");
        toast.show();
    }

    protected List<Object> getModules() {
        return Arrays.<Object>asList(new AppModule(this));
    }

    public void inject(Object object) {
        applicationGraph.inject(object);
    }

}
