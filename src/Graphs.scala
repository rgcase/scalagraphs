package Graphs

case class Node[T](label: T)
case class Edge[T, U](start: Node[T], end: Node[T], label: U = 1)

class Graph[T,U](nodes: Set[Node[T]], edges: Set[Edge[T,U]]) {
  lazy val isValid = edges.map {
    edge => (nodes contains edge.start) && (nodes contains edge.end)
  }.fold(true)(_ && _)
}
