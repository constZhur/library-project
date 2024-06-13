package ru.constZhur.library.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "language")
data class Language(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_id")
    val languageId: Int? = null,

    @Enumerated(EnumType.STRING)
    @Column(name = "name", nullable = false)
    val name: LanguageType,

    @ManyToMany(mappedBy = "languages")
    val books: List<Book> = mutableListOf()
)

