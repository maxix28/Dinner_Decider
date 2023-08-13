package com.example.dinnerdecider
import kotlin.random.*
class Choose {
    var list= mutableListOf<String>("Beer","mango","Salo")
    fun add(input:String)= list.add(input)
    fun deceide():String = list[Random.nextInt(0,list.size)]
}