import Graphs._

object Main {
	def main(args: Array[String]) = {
	  
		val g = new Graph(
		    nodes = Set(Node("A"), Node("B"), Node("C")),
		    edges = Set(Edge(Node("A"), Node("B")))
		    )
	  
		println(g)
		println(g.isValid)
	}
}