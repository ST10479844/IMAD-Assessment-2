package vcmsa.ci.flashcardapp4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)


        val correctAnswer = true // Example question


        //Feedback text
        val feedback = findViewById<TextView>(R.id.Feedbacktext)
        var score = intent.getIntExtra("score", 0)

        findViewById<TextView>(R.id.Question4).text = "The declaration of independence was signed on july 4th 1776."

        //True button.
        findViewById<Button>(R.id.Truebutton).setOnClickListener {
            if (correctAnswer) {
                feedback.text = "Correct!"
                score++
            } else {
                feedback.text = "Incorrect!"
                score++
            }
        }

        //False button.
        findViewById<Button>(R.id.Falsebutton).setOnClickListener {
            if (!correctAnswer) {
                feedback.text = "Correct!"
                score++
            } else {
                feedback.text = "Incorrect!"
                score++
            }

            //When the start button is clicked it will navigate to screen 6.
            findViewById<Button>(R.id.Nextbutton).setOnClickListener {
                val intent = Intent(this, MainActivity6::class.java)
                startActivity(intent)}
        }
    }
}