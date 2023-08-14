package pl.softfly.multi_module_room.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Card {
    @kotlin.jvm.JvmField
    @PrimaryKey
    var id: Int? = null
}