package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPanjangActivity : AppCompatActivity(), MainView {

    private lateinit var et_panjang_pp: EditText
    private lateinit var et_lebar_pp: EditText
    private lateinit var btn_hitungLuas_pp: Button
    private lateinit var btn_hitungKeliling_pp: Button
    private lateinit var tv_Hasil: TextView
    lateinit var mainPresenter: MainPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        mainPresenter = MainPresenter(this)
        et_panjang_pp = findViewById(R.id.et_panjang_pp)
        et_lebar_pp = findViewById(R.id.et_lebar_pp)
        btn_hitungLuas_pp= findViewById(R.id.btn_hitungLuas_pp)

        btn_hitungLuas_pp.setOnClickListener {
            val panjang = et_panjang_pp.text.toString().toFloat()
            val lebar = et_lebar_pp.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPanjang(panjang, lebar)
        }
        btn_hitungKeliling_pp.setOnClickListener {
            val panjang = et_panjang_pp.text.toString().toFloat()
            val lebar = et_lebar_pp.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPanjang(panjang, lebar)
        }
    }

    override fun updateLuas(luas: Float) {
        tv_hasil_pp.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        TODO("Not yet implemented")
    }

    override fun showError(errorMsg: String) {
        TODO("Not yet implemented")
    }
}