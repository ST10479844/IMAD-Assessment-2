package vcmsa.ci.flashcardapp4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)

        // Get the score passed from the last question activity
        val score = intent.getIntExtra("score", 0)

        // Display score
        val scoreTextView = findViewById<TextView>(R.id.Scoretext)
        scoreTextView.text = "You got $score out of 5!"

        // Display custom feedback based on the score
        val feedbackTextView = findViewById<TextView>(R.id.Feedbacktext)
        feedbackTextView.text = when (score) {
            in 4..5 -> "You’re a genius!"
            in 2..3 -> "Not bad! Keep Studying."
            else -> "Study harder!"
        }

        // Review button to show the correct answers
        findViewById<Button>(R.id.Reviewbutton).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        // Exit button to close the app
        findViewById<Button>(R.id.Exitbutton).setOnClickListener {
            finishAffinity()  // Close the app
        }
    }
}