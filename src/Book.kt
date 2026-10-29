class Book(
    var title: String = "",
    var author: String = "",
    var rating: Double = 0.0
) {
    override fun toString(): String {
        return "«$title» — $author (рейтинг: $rating)"
    }
}