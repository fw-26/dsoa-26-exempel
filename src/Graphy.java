import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Graphy {

    private HashMap<String, Node> nodes = new HashMap<>();

    private class Node {
        private Set<Node> edges;
        private String name;

        public Node(String name) {
            this.name = name;
            edges = new HashSet<>();
        }
    }

    public void addNode(String name) {
        Node node = nodes.get(name); // null om den inte finns
        if (node == null) {
            node = new Node(name);
            nodes.put(name, node);
        }
    }

    public void addEdge(String fromName, String toName) {
        Node fromNode = nodes.get(fromName);
        Node toNode = nodes.get(toName);
        fromNode.edges.add(toNode);
    }

    @Override
    public String toString() {
        String ret = "";
        for (String name: nodes.keySet()) {
            ret += "\n" + name + " ==> ";
            for (Node edge: nodes.get(name).edges) {
                ret += edge.name + " ";
            }
        }
        return ret;
    }
}
