package com.daggerdemo.model;

/**
 * Created by Zheng on 15/9/28.
 */
import dagger.Module;
import dagger.Provides;

@Module(complete = false, library = true)
class PumpModule {
    @Provides Pump providePump(Thermosiphon pump) {
        return pump;
    }
}
