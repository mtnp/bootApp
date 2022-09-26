import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.dogglers.MainActivity
import com.example.dogglers.R


class SatisfactionActivity : AppCompatActivity(){
    private lateinit var homeIntent: Intent


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_satisfaction)

        val homeButton: Button = findViewById(R.id.home_button)
        homeButton.setOnClickListener{
            homeIntent = Intent(this, MainActivity::class.java)
            startActivity(homeIntent)
        }
    }

}