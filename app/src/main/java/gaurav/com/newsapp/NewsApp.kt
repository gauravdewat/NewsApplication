package gaurav.com.newsapp

import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import gaurav.com.newsapp.di.DaggerAppComponent

class NewsApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
        }
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}