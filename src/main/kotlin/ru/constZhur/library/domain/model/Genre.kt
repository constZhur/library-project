package ru.constZhur.library.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "genre")
data class Genre(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id")
    val genreId: Int? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    val name: GenreType,

    @OneToMany(mappedBy = "genre")
    val books: List<Book> = mutableListOf()
)
