package br.com.fiap.contacts.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import br.com.fiap.contacts.model.Contact

@Dao
interface ContactDAO {

    @Insert
    fun save(contact: Contact): Long

    @Update
    fun update(contact: Contact): Int

    @Delete
    fun delete(contact: Contact): Int

    @Query("SELECT * FROM tb_contact WHERE id = :id")
    fun getById(id: Long): Contact

    @Query("SELECT * FROM tb_contact ORDER BY name ASC")
    fun getAll(): List<Contact>

}