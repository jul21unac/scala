object Facbric {
  private var incremental = 0
  def create(): Int = {
    incremental += 1
    incremental
  }

}
