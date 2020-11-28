package com.example.aldodokter.controller.activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.aldodokter.R
import com.github.appintro.AppIntro
import com.github.appintro.AppIntroFragment
import com.github.appintro.AppIntroPageTransformerType

class DetailImage : AppIntro() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get extra
        var nameAnimalIntent : String? = intent.getStringExtra("name")

        // Turtle got selected
        if (nameAnimalIntent.equals("Turtle")){
            turtleGotSelected()
        }

        // Sea Star got selected
        else if (nameAnimalIntent.equals("Sea Star")){
            seastarGotSelected()
        }

        // Plankton got selected
        else if (nameAnimalIntent.equals("Plankton")){
            planktonGotSelected()
        }

        setTransformer(AppIntroPageTransformerType.Flow)
        isColorTransitionsEnabled = true
        setImmersiveMode()
    }

    override fun onSkipPressed(currentFragment: Fragment?) {
        super.onSkipPressed(currentFragment)
        finish()
    }

    override fun onDonePressed(currentFragment: Fragment?) {
        super.onDonePressed(currentFragment)
        finish()
    }

    private fun turtleGotSelected(){
        addSlide(AppIntroFragment.newInstance(
            title = "Turtle 1",
            description = "Turtle 1",
            backgroundColor = Color.DKGRAY,
            imageDrawable = R.drawable.turtle1

        ))

        addSlide(AppIntroFragment.newInstance(
            title = "Turtle 2",
            description = "Turtle 2",
            imageDrawable = R.drawable.turtle2,
            backgroundColor = Color.BLUE
        ))

        addSlide(AppIntroFragment.newInstance(
            title = "Turtle 3",
            description = "Turtle 3",
            imageDrawable = R.drawable.turtle3,
            backgroundColor = Color.GRAY
        ))
    }

    private fun seastarGotSelected(){
        addSlide(AppIntroFragment.newInstance(
            title = "Sea star 1",
            description = "sea star 1",
            imageDrawable = R.drawable.seastar1,
            backgroundColor = Color.DKGRAY,

        ))

        addSlide(AppIntroFragment.newInstance(
            title = "sea star 2",
            description = "sea star 2",
            imageDrawable = R.drawable.seastar2,
            backgroundColor = Color.BLUE
        ))

        addSlide(AppIntroFragment.newInstance(
            title = "sea star 3",
            description = "sea star 3",
            imageDrawable = R.drawable.seastar3,
            backgroundColor = Color.GRAY
        ))
    }

    private fun planktonGotSelected(){
        addSlide(AppIntroFragment.newInstance(
            title = "plankton 1",
            description = "plankton 1",
            imageDrawable = R.drawable.plankton1,
            backgroundColor = Color.DKGRAY

        ))

        addSlide(AppIntroFragment.newInstance(
            title = "plankton 2",
            description = "plankton 2",
            imageDrawable = R.drawable.plankton2,
            backgroundColor = Color.BLUE
        ))

        addSlide(AppIntroFragment.newInstance(
            title = "plankton 3",
            description = "plankton 3",
            imageDrawable = R.drawable.plankton3,
            backgroundColor = Color.GRAY
        ))
    }

}