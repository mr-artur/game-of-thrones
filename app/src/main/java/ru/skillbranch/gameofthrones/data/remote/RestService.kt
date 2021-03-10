package ru.skillbranch.gameofthrones.data.remote

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import ru.skillbranch.gameofthrones.data.remote.res.CharacterRes
import ru.skillbranch.gameofthrones.data.remote.res.HouseRes

interface RestService {

    @GET("houses?pageSize=50")
    fun getHouses(@Query("page") page: Int = 1): Single<List<HouseRes>>

    @GET("characters/{id}")
    fun getCharacter(@Path("id") charterId: String): Single<CharacterRes>

    @GET("houses")
    fun getHouseByName(@Query("name") name: String): Single<List<HouseRes>>
}