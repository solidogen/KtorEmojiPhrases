package com.spyrdonapps.repository

import com.spyrdonapps.model.EmojiPhrase
import com.spyrdonapps.model.User

interface Repository {
    // TODO rename those after finishing
    suspend fun add(userId: String, emojiValue: String, phraseValue: String): EmojiPhrase?
    suspend fun phrase(id: Int): EmojiPhrase?
    suspend fun phrase(id: String): EmojiPhrase?
    suspend fun phrases(): List<EmojiPhrase>
    suspend fun remove(id: Int): Boolean
    suspend fun remove(id: String): Boolean
    suspend fun clear()

    suspend fun user(userId: String, hash: String? = null): User?
    suspend fun userByEmail(email: String): User?
    suspend fun userById(userId: String): User?
    suspend fun createUser(user: User)
}