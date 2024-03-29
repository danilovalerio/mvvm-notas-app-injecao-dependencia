package com.example.notasmvvm

import android.app.Application
import com.example.notasmvvm.di.ModulosDeDependencias
import org.koin.android.ext.android.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this,
            listOf(ModulosDeDependencias.moduloDaApp)
        )
    }
}