package ru.constZhur.library.domain.model

import jakarta.persistence.*

@Entity
@Table(name = "publisher")
data class Publisher(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    val publisherId: Int? = null,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "address")
    val address: String? = null,

    @Column(name = "phone")
    val phone: String? = null,

    @OneToMany(mappedBy = "publisher")
    val books: List<Book> = mutableListOf()
)
