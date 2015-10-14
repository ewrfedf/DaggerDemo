/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dagger.activitygraphs.module;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.dagger.activitygraphs.DemoBaseActivity;
import com.example.dagger.activitygraphs.ui.AboutFragment;
import com.example.dagger.activitygraphs.ui.ActivityTitleController;
import com.example.dagger.activitygraphs.ui.HomeActivity;
import com.example.dagger.activitygraphs.ui.HomeFragment;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module(
        complete = false,
        injects = {
                AboutFragment.class,
                HomeActivity.class,
                HomeFragment.class
        },
        library = true
)
public class ActivityModule {

    private final DemoBaseActivity activity;

    public ActivityModule(DemoBaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    @Singleton
    @ForActivity
    Context provideActivityContext() {
        return activity;
    }

    @Provides
    @Singleton
    ActivityTitleController provideTitleController() {
        return new ActivityTitleController(activity);
    }

    @Provides
    @Singleton
    public Toast provideToast(Application application) {
        return Toast.makeText(application, "", Toast.LENGTH_SHORT);
    }

}
