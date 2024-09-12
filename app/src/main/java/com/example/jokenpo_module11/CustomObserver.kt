package com.example.jokenpo_module11

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class CustomObserver: DefaultLifecycleObserver, LifecycleEventObserver {

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

        Log.d("Lyfecycle", " Observer ${owner.toString()} - onResume")
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {

        Log.d("Lyfecycle", " Observer ${source.toString()} event: ${event.toString()}")
    }


}