package com.geeks.hw6_m3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.geeks.hw6_m3.databinding.FragmentCountryBinding
import android.view.View

class CountryFragment : Fragment() {

    private lateinit var binding: FragmentCountryBinding
    private var position: Int = 0
    private val adapter = CountryAdapter(this::onClick)
    private val continentAdapter = ContinentAdapter(this::onClick)
    private val countries = arrayListOf<Country>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCountryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvCountry.adapter = adapter
        position = arguments?.getInt("cont") ?: 0

        when (position) {
            0 -> loadAsia()
            1 -> loadAmerica()
            2 -> loadAustralia()
            3 -> loadEurope()
            4 -> loadAfrica()
        }

        adapter.loadData(countries)
    }

    private fun loadAsia() {
        val listKyrgyzstan = arrayListOf(
            Continent("Bishkek", "https://too.kg/wp-content/uploads/original_bishkek_photo_hdzugvz-e1523868725389.jpg"),
            Continent("Osh", "https://too.kg/en/wp-content/uploads/DSC_0576-1024x681.jpg"),
            Continent("Naryn", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6xiAC9bXi5beuC0Tqw8CXb7nDuOlH3_rpTg&s")
        )

        val listUzbekistan = arrayListOf(
            Continent("Tashkent", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/15/33/fb/7b/tashkent.jpg?w=1400&h=1400&s=1"),
            Continent("Buhara", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRZDT83N9SqieAkaQLCevW1JugR2qV_Q9AQRA&s"),
            Continent("Samarkand", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcScuaQPLs6n-xwOv-qG02OQMuA2KZYQXQGeBA&s")
        )

        val listKazahstan = arrayListOf(
            Continent("Almaty", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRh-drDisCeYompygUIDA9eJzEdjrEah3AjxA&s"),
            Continent("Astana", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSS4tbnY1-gg4RFlZ5o5_Aq5lIdzRlit6fgzA&s"),
            Continent("Aktau", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJuRESwvcBZoIShZikXBAuUiyhpSEYIcmSng&s")
        )

        countries.addAll(
            listOf(
                Country("Kyrgyzstan", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/640px-Flag_of_Kyrgyzstan.svg.png", listKyrgyzstan),
                Country("Uzbekistan", "https://cdn.britannica.com/47/7247-050-BEEDE5E3/Flag-Uzbekistan.jpg", listUzbekistan),
                Country("Kazahstan", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRW1-NHqDoJEboA_0szgxy2YC-CxyDF-TWa6A&s", listKazahstan)
            )
        )
    }

    private fun loadAmerica() {
        val listArgentina = arrayListOf(
            Continent("Buenos Aires", "https://cdn.tripster.ru/thumbs2/732b95e8-e8e6-11ee-b1b1-befc76184d1e.1220x600.jpeg"),
            Continent("Mendoza", "https://www.quinta.ru/upload/iblock/062/w3vfycqqb34981bfrdz38a1pknp101r9/Argentina%20Mendoza.jpg"),
            Continent("San Miguel de Tucumán", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_S0SEdYuDMGkEaghY12Qc7YEVRssINSNorg&s")
        )

        val listBolivia = arrayListOf(
            Continent("Santa Cruz", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5QSDxnS2WN00cyOnOr4T7pnVDrFLpXmUL-g&s"),
            Continent("La Paz", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRRuGkUyqxhmVA4XlKE7B3CPpK3rQME5A9vrA&s"),
            Continent("Oruro", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/04/20/82/87/carnaval-de-oruro.jpg?w=1000&h=1000&s=1")
        )

        val listChile = arrayListOf(
            Continent("Santiago", "https://img.pac.ru/resorts/213108/247551/big/9248FFDD7F000101767DD0F9E7D36199.jpg"),
            Continent("Valparaíso", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/15/33/fc/b7/valparaiso.jpg?w=1200&h=700&s=1"),
            Continent("Antofagasta", "https://lh3.googleusercontent.com/proxy/2QNN2PhdSn-YZrvnehbkmJb9rRDxTfRJnNJt3QTYRIqtAJDYHKvjE9PyNF40kACfwMMn85BYfSKrwBE9WrRAgXCe41M3saSYV5cMDvx3-4QeKenLpWTEwsILt5POvCu_MWbMCJGGWxf5pgkU6iD7cADsXgNt_Q")
        )

        countries.addAll(
            listOf(
                Country("Argentina", "https://m.media-amazon.com/images/I/61H5FszKQvL._AC_UF1000,1000_QL80_.jpg", listArgentina),
                Country("Bolivia", "https://cdn.britannica.com/54/6754-050-897FBD93/Flag-Bolivia.jpg", listBolivia),
                Country("Chile", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz3KlVNpuGO8tTjpAAolF2iDUk6wWf2o41PQ&s", listChile)
            )
        )
    }

    private fun loadAustralia() {
        val listAustralia = arrayListOf(
            Continent("Melbourne", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRGlLatM-kX9UbyHJhNviWksLYvw0Cto7QiaQ&s"),
            Continent("Sydney", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCr4RPaMlmiMMYaThlff5QBMMcaZyN20UVqw&s"),
            Continent("Brisbane", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnUA5WOXL8jhq2CqztKeSCuBmNp4bqTXGDDg&s")
        )

        countries.addAll(
            listOf(
                Country("Australia", "https://m.media-amazon.com/images/I/71nN-nDOObL._AC_UF894,1000_QL80_.jpg", listAustralia),
            )
        )
    }

    private fun loadEurope() {
        val listLondon = arrayListOf(
            Continent("Edinburgh", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQKb0HwUN5WiMqst4BFf2UUtSwTBqLhQzeOyw&s"),
            Continent("Islington", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJblurE_n1Zsna0j4kcQEdBExXDxRFhbNqoQ&s"),
            Continent("Westminster", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7Plnenpqc4CfPT3XJXP_uR5vchqs_sRITeA&s")
        )

        val listFrance = arrayListOf(
            Continent("Paris", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa-r1pumJa63YkTyjpb3rD6t87RHwsLptKvw&s"),
            Continent("Lyon", "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/14/da/01/47/vieux-lyon.jpg?w=900&h=500&s=1"),
            Continent("Marseille", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSA2kSUiOdE9CTTWyPOR0OL2txQVSqXuDwUFw&s")
        )

        val listGermany = arrayListOf(
            Continent("Berlin", "https://cdn.tripster.ru/thumbs2/f71ccace-24b5-11ef-b401-7ac89597210f.1220x600.jpeg"),
            Continent("Hamburg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS78PMLZG0Z2sAzjTw2HLw9eRVjsF6GAS-c6A&s"),
            Continent("Köln", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0eV-Iz9wuiKwCMvhvaWNvq4yeRNdsK1ngYw&s")
        )

        countries.addAll(
            listOf(
                Country("London", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRWnI_EHW3_TlJHyz_r2m5Me4O57cvxXAyvWg&s", listLondon),
                Country("France", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS_nAGd8GRzURpcSX3BIF41_CyTYQEBJWwJpQ&s", listFrance),
                Country("Germany", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTtzkF0xictbmeJ7OmTD5KQdaP1mts2r4z2Jw&s", listGermany)
            )
        )
    }

    private fun loadAfrica() {
        val listAlgeria = arrayListOf(
            Continent("Algiers", "https://cms.enjourney.ru/upload/Jana/Algeria/Algiers/Al6.jpg"),
            Continent("Oran", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7SPsvuXNGSHceCZ-djsaHKB6sbedVfA1IIw&s"),
            Continent("Constantine", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSs1062YQOMNnoWLCM1UINi9RFs1JnWxU-cug&s")
        )

        val listAngola = arrayListOf(
            Continent("Luanda", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1lS3TO5oLUYvMmX0uRUlNhbetN8D8txZ4Cw&s"),
            Continent("Huambo", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6q0a4PLVjK7Oo7_Q6WHVE2n6YbVy5VqSssA&s"),
            Continent("Benguela", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQo6lcR7UHxwh1dxNyZn-uMVSIY71PV9ydu4Q&s")
        )

        val listBotswana = arrayListOf(
            Continent("Gaborone", "https://eurokurort.by/images/fotobank/nation/145/21314_big.jpg"),
            Continent("Francistown", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRvAJ2QHJgPr4BZGxx78MJLoHMNIKXYONUcgw&s"),
            Continent("Maun", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0OfTGkwKDNY_TRfK2GyyZ3rwKc9K9hOVK_Q&s")
        )

        countries.addAll(
            listOf(
                Country("Algeria", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTqpwWCHK7mNqGqRa8mIRt0egTb1fKy0I7z0A&s", listAlgeria),
                Country("Angola", "https://cdn.britannica.com/47/7247-050-BEEDE5E3/Flag-Uzbekistan.jpg", listAngola),
                Country("Botswana", "https://cdn11.bigcommerce.com/s-hhbbk/products/181/images/35976/BOTS0001__06068.1580483000.500.750.png?c=2", listBotswana)
            )
        )
    }


    fun onClick(position: Int) {
        binding.rvCountry.visibility = View.GONE
        binding.rvCities.visibility = View.VISIBLE
        binding.rvCities.adapter = continentAdapter
        continentAdapter.loadData(countries[position].cities)
    }

//    override fun onDestroyView() {
//        super.onDestroyView()
//        binding = null
//    }
}
