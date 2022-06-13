package com.example.mvp

class MainPresenter(private val mainView: MainView) {
    fun hitungLuasPersegiPanjang(panjang: Float, lebar: Float){
        if (panjang == 0F || panjang == null){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F || lebar == null){
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPanjang(panjang: Float, lebar: Float){
        if (panjang == 0F || panjang == null){
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F || lebar == null){
            mainView.showError("Lebar tidak boleh 0")
            return
        }
        val keliling = 2*(panjang+lebar)
        mainView.updateKeliling(keliling)
    }

    fun hitungLuasPersegi(sisi: Float){
        if (sisi == 0F || sisi == null){
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val luas = sisi * sisi
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegi(sisi: Float){
        if (sisi == 0F || sisi == null){
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val keliling = 4 * sisi
        mainView.updateKeliling(keliling)
    }
}