package com.example.laboratorio02

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVerificar.setOnClickListener{


            if(edtAnio.text.toString() == ""){
                //this.mensaje2("Debe ingresar su año de nacimiento")
                Toast.makeText(this,"Debe ingresar año nacimiento",Toast.LENGTH_LONG).show()
                return@setOnClickListener
                }
            //val imagenelegida=""
            var respuestapoblacion=""
            val rasgo=imgRasgo
            val aniox=edtAnio.text.toString()
            val anioxint:Int?=aniox.toInt()
            var mensajeaniox="XX"
                if(anioxint!=null){
                    val respuesta = when (anioxint){
                        in 1930 .. 1948 -> {
                            respuestapoblacion="6,300,000"
                            val imagene=R.drawable.gen_austeridad
                            imgRasgo.setImageResource(imagene)
                            "Silent generation"
                        }
                        in 1949 .. 1968 -> {
                            respuestapoblacion="12,200,000"
                            val imagene=R.drawable.gen_ambicion
                            imgRasgo.setImageResource(imagene)
                            "Generación Baby Boom"
                        }
                        in 1969 .. 1980 -> {
                            respuestapoblacion="9,300,000"
                            val imagene=R.drawable.gen_obsesion
                            imgRasgo.setImageResource(imagene)
                            "Generación X"
                        }
                        in 1981 .. 1993 -> {
                            respuestapoblacion="7,200,000"
                            val imagene=R.drawable.gen_frustracion
                            imgRasgo.setImageResource(imagene)
                            "Generación Y - millennials"
                        }
                        in 1994 .. 2010 -> {
                            respuestapoblacion="7,800,000"
                            val imagene=R.drawable.gen_irreverencia
                            imgRasgo.setImageResource(imagene)
                            "Generación Z"
                        }
                        else -> {
                            "No pertenece a ninguna generación"
                            respuestapoblacion="--"
                            val imagene=R.drawable.gen_nada
                            imgRasgo.setImageResource(imagene)
                        }

                        }
                    tvResultado.text="$respuesta"
                    tvPoblacion.text="Población de $respuestapoblacion"


                    }


        }
    }

}