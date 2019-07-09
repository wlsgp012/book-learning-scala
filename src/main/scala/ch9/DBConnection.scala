package ch9

object DBConnection {
  private val db_url = "jdbc://localhost"
  private val db_user = "franken"
  private val db_pass = "berry"
  def apply() = new DBConnection
}
class DBConnection {
  private val props = Map(
    "url" -> DBConnection.db_url,
    "user" -> DBConnection.db_user,
    "pass" -> DBConnection.db_pass,
  )
  println(s"Created new connection for ${props("url")}")

}

object Test extends App{
  val conn  = DBConnection()
  println(conn)
}
