package com.axdev.gamma26pokedex2.ui

/**
 * Created by HachaDev 23/06/24
 */

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.axdev.gamma26pokedex2.apiobjects.Ability
import com.axdev.gamma26pokedex2.apiobjects.EffectEntries
import com.axdev.gamma26pokedex2.apiobjects.Held_Items
import com.axdev.gamma26pokedex2.apiobjects.Language
import com.axdev.gamma26pokedex2.apiobjects.Stats
import com.axdev.gamma26pokedex2.apiqueryabilities.APIServiceAbilities
import com.axdev.gamma26pokedex2.apiqueryhelditems.APIServiceHeldItems
import com.axdev.gamma26pokedex2.apiqueryhelditems.ResponseHeldItems
import com.axdev.gamma26pokedex2.apiquerypokemon.APIServicePokemon
import com.axdev.gamma26pokedex2.databinding.ActivityMain2Binding
import com.axdev.gamma26pokedex2.recyclerview1.Adapter1
import com.axdev.gamma26pokedex2.recyclerview1.Provider1
import com.axdev.gamma26pokedex2.recyclerview1.Recycler1Object
import com.axdev.gamma26pokedex2.recyclerview2.Adapter2
import com.axdev.gamma26pokedex2.recyclerview2.BindRecycler2
import com.axdev.gamma26pokedex2.recyclerview2.Provider2
import com.axdev.gamma26pokedex2.recyclerview3.Adapter3
import com.axdev.gamma26pokedex2.recyclerview3.AdapterForListRecycler3
import com.axdev.gamma26pokedex2.recyclerview3.Provider3.Companion.descriptionList
import com.axdev.gamma26pokedex2.recyclerview4.Adapter4
import com.axdev.gamma26pokedex2.recyclerview4.Provider4.Companion.recycler4List
import com.axdev.gamma26pokedex2.recyclerview5.Adapter5
import com.axdev.gamma26pokedex2.recyclerview5.Provider5.Companion.recycler5List
import com.axdev.gamma26pokedex2.recyclerview6.Adapter6
import com.axdev.gamma26pokedex2.recyclerview6.Provider6.Companion.recycler6List
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.Locale


class MainActivity2 : AppCompatActivity(),
    androidx.appcompat.widget.SearchView.OnQueryTextListener {
    private lateinit var binding2: ActivityMain2Binding
    private lateinit var mediaAudio: MediaPlayer
    private lateinit var uri: Uri
    private val coroutineAbilities = CoroutineScope(Dispatchers.Default)
    private val coroutineHeldItems = CoroutineScope(Dispatchers.Default)
    private val bindList = BindRecycler2()// Clase para no meter tanto codigo aqui
    private val abilityList: MutableList<Ability> = mutableListOf()
    private val heldItemList: MutableList<Held_Items> = mutableListOf()
    private val tag: String = "MainActivity2"
    private var prequery: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)
        binding2.searchview1.setOnQueryTextListener(this)
    }

    private fun initRecyclerView1() {
        val manager = LinearLayoutManager(MainActivity2())
        val decorator = DividerItemDecoration(binding2.recyclerview1.context, manager.orientation)
        binding2.recyclerview1.setHasFixedSize(true)
        binding2.recyclerview1.layoutManager = manager
        binding2.recyclerview1.adapter =
            Adapter1(Provider1.pokeList) { recycler1Object -> onItemSelecter1(recycler1Object) }
        binding2.recyclerview1.addItemDecoration(decorator)
    }

    private fun initRecyclerView2() {
        val manager = GridLayoutManager(MainActivity2(), 2)
        val decorator = DividerItemDecoration(binding2.recyclerview2.context, manager.orientation)
        binding2.recyclerview2.setHasFixedSize(true)
        binding2.recyclerview2.layoutManager = manager
        binding2.recyclerview2.adapter =
            Adapter2(Provider2.spritesList) { string -> onItemSelecter2(string) }
        binding2.recyclerview2.addItemDecoration(decorator)
    }

    private fun initRecyclerView3() {
        val manager = LinearLayoutManager(MainActivity2())
        val decorator = DividerItemDecoration(binding2.recyclerview3.context, manager.orientation)
        binding2.recyclerview3.setHasFixedSize(true)
        binding2.recyclerview3.layoutManager = manager
        binding2.recyclerview3.adapter =
            Adapter3(descriptionList) { adapterForListRecycler3 ->
                onItemSelecter3(
                    adapterForListRecycler3
                )
            }
        binding2.recyclerview3.addItemDecoration(decorator)
    }

    private fun initRecyclerView4() {
        val manager = GridLayoutManager(MainActivity2(), 4)
        val decorator = DividerItemDecoration(binding2.recyclerview4.context, manager.orientation)
        binding2.recyclerview4.setHasFixedSize(true)
        binding2.recyclerview4.layoutManager = manager
        binding2.recyclerview4.adapter =
            Adapter4(recycler4List) { string -> onItemSelecter4(string) }
        binding2.recyclerview4.addItemDecoration(decorator)
    }

    private fun initRecyclerView5() {
        val manager = LinearLayoutManager(MainActivity2())
        val decorator = DividerItemDecoration(binding2.recyclerview5.context, manager.orientation)
        binding2.recyclerview5.setHasFixedSize(true)
        binding2.recyclerview5.layoutManager = manager
        binding2.recyclerview5.adapter =
            Adapter5(recycler5List) { stats -> onItemSelecter5(stats) }
        binding2.recyclerview5.addItemDecoration(decorator)
    }

    private fun initRecyclerView6() {
        val manager = LinearLayoutManager(MainActivity2())
        val decorator = DividerItemDecoration(binding2.recyclerview6.context, manager.orientation)
        binding2.recyclerview6.setHasFixedSize(true)
        binding2.recyclerview6.layoutManager = manager
        binding2.recyclerview6.adapter =
            Adapter6(recycler6List) { responseHeldItems -> onItemSelecter6(responseHeldItems) }
        binding2.recyclerview6.addItemDecoration(decorator)
    }

    private fun onItemSelecter6(responseHeldItems: ResponseHeldItems) {
        //Nothing of interest in this method
    }

    private fun onItemSelecter5(stats: Stats) {
        //Nothing of interest in this method
    }

    private fun onItemSelecter4(string: String) {
        //Nothing of interest in this method
    }

    private fun onItemSelecter3(adapterForListRecycler3: AdapterForListRecycler3) {
        //Nothing of interest in this method
    }

    private fun onItemSelecter2(string: String) {
        Toast.makeText(this, string.substring(73), Toast.LENGTH_SHORT).show()
    }

    private fun onItemSelecter1(item: Recycler1Object) {
        //Nothing of interest in this method
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun searchByName(query: String) {
        if (prequery == query) {
            hideKeyboard()
            return
        }
        CoroutineScope(Dispatchers.IO).launch {
            val call = getRetrofit().create(APIServicePokemon::class.java)
                .getCharacterByName("pokemon/$query").execute()
            val puppies = call.body()
            prequery = query
            Provider1.pokeList.clear()
            bindList.clearList()
            descriptionList.clear()
            abilityList.clear()
            recycler4List.clear()
            recycler5List.clear()
            recycler6List.clear()
            runOnUiThread {
                if (call.isSuccessful) {
                    if (puppies != null) {
                        Provider1.pokeList.add(
                            Recycler1Object(
                                "Name: ",
                                puppies.name.uppercase(Locale.ROOT)
                            )
                        )
                        Provider1.pokeList.add(Recycler1Object("ID: ", puppies.id.toString()))
                        Provider1.pokeList.add(
                            Recycler1Object(
                                "Height: ",
                                (puppies.height * 10).toString() + " cm"
                            )
                        )
                        Provider1.pokeList.add(
                            Recycler1Object(
                                "Weight: ",
                                (puppies.weight / 10).toString() + " kg"
                            )
                        )
                        Provider1.pokeList.add(Recycler1Object("Order: ", puppies.order.toString()))
                        initRecyclerView1()
                        uri = Uri.parse(puppies.cries.latest)
                        mediaAudio = MediaPlayer.create(this@MainActivity2, uri)
                        mediaAudio.start()
                        bindList.onBindList(puppies.sprites)
                        initRecyclerView2()
                        if (puppies.abilities.isNotEmpty()) {
                            for (i in puppies.abilities) {
                                abilityList.add(i.ability)
                            }
                            for (i in abilityList) {
                                searchByAbilities(i.name)
                            }
                        }
                        if (puppies.types.isNotEmpty()) {
                            for (i in puppies.types) {
                                recycler4List.add(i.type.name)
                            }
                            binding2.textviewrecycler4.text = "TYPES"
                            initRecyclerView4()
                        }
                        if (puppies.stats.isNotEmpty()) {
                            binding2.recyclerview5.visibility = View.VISIBLE
                            for (i in puppies.stats) {
                                recycler5List.add(i)
                            }
                            binding2.textviewrecycler5.text = "STATS"
                            initRecyclerView5()
                        } else {
                            binding2.recyclerview5.visibility = View.INVISIBLE
                        }

                        if (puppies.held_items.isNotEmpty()) {
                            for (i in puppies.held_items) {
                                heldItemList.add(i)
                            }
                            for (i in heldItemList) {
                                searchByHeldItem(i.item.name)
                            }
                        }
                    }
                } else {
                    showErrorDialog()
                    startActivity(
                        Intent(this@MainActivity2, MainActivity2::class.java),
                        null
                    )
                }
                hideKeyboard()
            }
        }


    }

    private fun searchByAbilities(query: String) {
        coroutineAbilities.launch(Dispatchers.Default) {
            val call = getRetrofit().create(APIServiceAbilities::class.java)
                .getCharacterByAbilities("ability/$query").execute()
            val abilitiesresponse = call.body()
            val adapterForListRecycler3 = AdapterForListRecycler3("", "")
            runOnUiThread {
                if (call.isSuccessful) {
                    if (abilitiesresponse != null) {
                        if (abilitiesresponse.effect_entries.isNotEmpty()) {
                            binding2.recyclerview6.visibility = View.VISIBLE
                            adapterForListRecycler3.name = abilitiesresponse.name
                            Log.i(tag, adapterForListRecycler3.name)
                            for (i in abilitiesresponse.effect_entries.indices) {
                                if (abilitiesresponse.effect_entries[i].language.name == "en") {
                                    adapterForListRecycler3.effect =
                                        abilitiesresponse.effect_entries[i].short_effect
                                }
                            }
                            descriptionList.add(adapterForListRecycler3)
                            binding2.textviewrecycler3.text = "ABILITIES"
                            initRecyclerView3()
                        }
                    } else {
                        binding2.recyclerview3.visibility = View.INVISIBLE
                    }
                }
            }
        }
    }

    private fun searchByHeldItem(query: String) {
        coroutineHeldItems.launch(Dispatchers.Default) {
            val call = getRetrofit().create(APIServiceHeldItems::class.java)
                .getCharacterByHeldItems("item/$query").execute()
            val helditemsresponse = call.body()
            val english: Language = Language("English")
            val responseHeldItems = ResponseHeldItems("", listOf(EffectEntries("", english,"")))
            runOnUiThread {
                if (call.isSuccessful) {
                    if (helditemsresponse != null) {
                        binding2.recyclerview6.visibility = View.VISIBLE
                        binding2.textviewrecycler6.visibility = View.VISIBLE
                        responseHeldItems.name = helditemsresponse.name
                        for (i in helditemsresponse.effect_entries.indices) {
                            if (helditemsresponse.effect_entries[i].language.name == "en") {
                                responseHeldItems.effect_entries =
                                    helditemsresponse.effect_entries                            }
                            recycler6List.add(responseHeldItems)
                        }
                        binding2.textviewrecycler6.text = "HELD ITEMS"
                        initRecyclerView6()
                    }
                }else{
                    binding2.recyclerview6.visibility = View.INVISIBLE
                    binding2.textviewrecycler6.visibility = View.INVISIBLE
                }
            }
        }
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        if (query != null) {
            binding2.searchClick.visibility = View.INVISIBLE
            searchByName(query.lowercase(Locale.ROOT))
        }
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return true
    }

    private fun showErrorDialog() {
        Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_LONG).show()
    }

    private fun hideKeyboard() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding2.searchview1.windowToken, 0)
    }
}