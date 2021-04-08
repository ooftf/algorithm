package com.ooftf.algorithm.kt

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ooftf.engine.glda.engine.deployDefaultValue
import com.ooftf.engine.glda.engine.deployLiveData

/**
 *
 */
object GsonTest {
    val gString = "{\"name\":null,\"desc\":\"dashuaibi\"}"

    @JvmStatic
    fun main(args: Array<String>) {
        var gson = GsonBuilder().deployLiveData().deployDefaultValue().create()
       val bean =  gson.fromJson(gString, GsonBean::class.java)
        println(bean.name)
        println(bean.desc)
    }
}