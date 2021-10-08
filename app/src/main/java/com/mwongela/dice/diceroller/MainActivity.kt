package com.mwongela.dice.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**
         * Declare your button variables and initialize them using the findViewById Method
         * setOnClickListener to listen for click events on the button and call the appropriate functions
         */
        val buttonToast: Button = findViewById(R.id.button_toast)
        buttonToast.setOnClickListener { toastMyButton() }

        val buttonRoll: Button = findViewById(R.id.button_roll)
            buttonRoll.setOnClickListener { rollDice() }
    }

    /**
     * Create a function that shows a toast on pressing the toast button
     */
    private fun toastMyButton(){
      Toast.makeText(this,"OOH My,First App!!!!",Toast.LENGTH_SHORT).show()
    }
    /**
     * Create a function that generates a random number on clicking the dice
     */
    private fun rollDice(){
// create a variable for storing the generated random number
        val randomInt = (1..12).random()
//Declare a variable to reference to the textview to display the result
        val textResult: TextView = findViewById(R.id.textResult)
//Pass the random number to the created textview variable
        textResult.text = randomInt.toString()
    }


}