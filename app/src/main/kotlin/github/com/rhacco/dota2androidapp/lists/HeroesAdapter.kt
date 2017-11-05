package github.com.rhacco.dota2androidapp.lists

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import github.com.rhacco.dota2androidapp.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_heroes.*

class HeroesAdapter(context: Context) : RecyclerView.Adapter<HeroesViewHolder>() {
    private val mInflater: LayoutInflater = LayoutInflater.from(context)
    private val mHeroNames: List<String> = listOf("Abaddon", "Alchemist", "Ancient Apparition", "Anti-Mage")

    override fun getItemCount(): Int = mHeroNames.size

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): HeroesViewHolder =
            HeroesViewHolder(mInflater.inflate(R.layout.item_heroes, parent, false))

    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val heroName = mHeroNames[position]
        holder.textView?.text = heroName
    }
}

class HeroesViewHolder(view: View?, override val containerView: View? = view) :
        RecyclerView.ViewHolder(view), LayoutContainer
