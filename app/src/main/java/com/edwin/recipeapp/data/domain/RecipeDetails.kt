package com.edwin.recipeapp.data.domain

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity(tableName = "recipeDetails")
data class RecipeDetails(
    @PrimaryKey val uuid: String,
    val name: String,
    val images: List<String>,
    val lastUpdated: Long,
    val description: String?,
    val instructions: String?,
    val difficulty: Int,
    val similar: List<RecipeBrief>
) : Parcelable

@Parcelize
data class RecipeBrief(
    val uuid: String,
    val name: String,
    val image: String
) : Parcelable