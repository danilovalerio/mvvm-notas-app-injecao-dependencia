package com.example.notasmvvm.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notasmvvm.data.GestorDeNotas
import com.example.notasmvvm.data.Nota

/**
 * Essa classe será a gestora das notas, e pode ser utilizada por qualquer view
 */

class NotasViewModel(val gestorNotas: GestorDeNotas): ViewModel() {

    private var mNotas: MutableLiveData<MutableList<Nota>>? = null

    //retorna as notas
    fun getNotas():MutableLiveData<MutableList<Nota>> {
        //Se for nula, inicia ela com a lista que está na camada de modelo "GestorDeNotas"
        if (mNotas == null){
            mNotas = gestorNotas.getNotas()
        }
        return mNotas!!
    }

    //salvar as notas
    fun salvar(mNota: Nota){
        gestorNotas.addNota(mNota)
    }
}