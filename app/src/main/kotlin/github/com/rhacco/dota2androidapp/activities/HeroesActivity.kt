package github.com.rhacco.dota2androidapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import github.com.rhacco.dota2androidapp.R

class HeroesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes)
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
