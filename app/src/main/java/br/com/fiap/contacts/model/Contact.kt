package br.com.fiap.contacts.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_contact")
data class Contact(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    var name: String = "",

    @ColumnInfo(name = "is_friend")
    var isFriend: Boolean = false,

    var telephone: String = ""
)
