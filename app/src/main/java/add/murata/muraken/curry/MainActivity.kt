package add.murata.muraken.curry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("おっち―","まっすー","しんぺー","おんじ")
    val food = arrayOf<String>("かれー","みそしる","ちゃーはん","えびちり")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun servefood(view: View?){

        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]

        nameTextView.text = name + "に"
        foodTextView.text = food[Random.nextInt(4)] + "を"

        if(Random.nextInt(100)<50){
            verbTextView.text = "よそえました^^"
        }else{
            verbTextView.text = "よそえませんでした"
        }
    }
}