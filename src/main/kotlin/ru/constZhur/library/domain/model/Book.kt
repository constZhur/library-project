package ru.constZhur.library.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "book")
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    val bookId: Int,

    @Column(name = "title", nullable = false)
    val title: String,

    @Column(name = "isbn", unique = true, nullable = false)
    val isbn: String,

    @Column(name = "publication_year")
    val publicationYear: Int,

    @ManyToMany
    @JoinTable(
        name = "book_author",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "author_id")]
    )
    val authors: List<Author> = mutableListOf(),

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false)
    val publisher: Publisher,

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false)
    val genre: Genre?,

    @ManyToMany
    @JoinTable(
        name = "book_language",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "language_id")]
    )
    val languages: List<Language> = mutableListOf(),

    @Column(name = "total_copies", nullable = false)
    val totalCopies: Int
)
