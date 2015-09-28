package com.daggerdemo.model;

/**
 * Created by Zheng on 15/9/28.
 */
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(
        injects = CoffeeApp.class,
        includes = PumpModule.class
)
class DripCoffeeModule {
    @Provides @Singleton Heater provideHeater() {
        return new ElectricHeater();
    }
}
