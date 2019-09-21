package com.example.kotlinparaprincipiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        variablesYConstantes();
    }
    /* Variables y Constantes */

    private fun variablesYConstantes()
    {
        //Variables

        var myFirstVariable = "Hello HackerMan";
        var myFirstNumber = 1;
        var mySecondVariable = "Suscribete";

        myFirstVariable = "Bienvenidos a MauroSystem";


        println(myFirstVariable);
        println(mySecondVariable);

        mySecondVariable = myFirstVariable;

        println(mySecondVariable);

        //Constantes

        val myFistConstant = "Te ha gustado?";

        println(myFistConstant);

        val mySecondConstant = myFirstVariable;

        println(mySecondConstant);
    }
}
