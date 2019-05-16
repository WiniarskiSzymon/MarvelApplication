package com.example.marvelviewpagerlivedata.Repository

import java.sql.Timestamp
import java.security.MessageDigest



class RequestHelper {

    private val publicApiKey="c0170d95c2954ef59aba1a01ad2b6668"
    private val privateApiKey="3098add771e68b4072e05cbee89745f01a692e7b"




    fun getTimeStamp()= Timestamp(System.currentTimeMillis()).toString()
    fun getMD5Hash(): String {
        val md = MessageDigest.getInstance("MD5")
        val ts = Timestamp(System.currentTimeMillis()).toString()
        return md.digest((ts  + privateApiKey+ publicApiKey).toByteArray()).toString().padStart(32, '0')
    }
    fun getApiKey() = publicApiKey



}