package fastcampus.aop.part4.chapter02.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {
    @GET("/v3/dc38b936-8f69-47f8-b8b1-692e1b34f8a3")
    fun listMusics() : Call<MusicDto>
}