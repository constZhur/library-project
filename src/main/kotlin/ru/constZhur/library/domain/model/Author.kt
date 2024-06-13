package ru.constZhur.library.domain.model

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "author")
data class Author(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    val authorId: Int,

    @Column(name = "first_name", nullable = false)
    val firstName: String,

    @Column(name = "last_name", nullable = false)
    val lastName: String,

    @Column(name = "date_of_birth")
    val dateOfBirth: LocalDate,

    @ManyToMany(mappedBy = "authors")
    val books: List<Book> = mutableListOf()
)

