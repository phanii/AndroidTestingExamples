package com.maskaravivek.testingexamples.di

import android.app.Application
import com.maskaravivek.testingexamples.ExamplesApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [(AndroidSupportInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun appModule(appModule: AppModule): Builder
        fun build(): AppComponent
    }

    fun inject(application: ExamplesApplication)
}