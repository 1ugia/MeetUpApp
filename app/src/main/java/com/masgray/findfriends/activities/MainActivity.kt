package com.masgray.findfriends.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.masgray.findfriends.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val findfriendbtn = findViewById<Button>(R.id.findFriendButton)
        findfriendbtn.setOnClickListener {
            val intent = Intent(this, FindFriendsActivity::class.java)
            startActivity(intent)
        }
    }

}

//def noise(animal)
//            if animal == "cat"
//                "meow"
//            elsif animal == "dog"
//                "woof"
//            else
//                "hi"
//            end
//        end
//        puts noise("cat")


//        fun noise(animal: String){
//            if (animal == "cat"){
//                println("meow")
//            }else if (animal == "dog"){
//                println("woof")
//            } else {
//                println("hi")
//            }
//        }

//        fun noise(animal: String): String {
//             return when (animal) {
//                "cat" -> "meow"
//                "dog" -> "woof"
//                else -> "hi"
//            }
//        }
//        print(noise("cat"))
//        var fluff = noise("dog")
//        println("dog makes a sound:")
//        println(fluff)
//
//        fluff = noise("cat")