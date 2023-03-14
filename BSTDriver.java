public class BSTDriver {
    public static void main(String[] args) {
        BST<String, Integer> bst = new BST<>();
        System.out.println("size" + bst.size());
        bst.put("a", 1);
        bst.put("b", 2);
        bst.put("c", 3);
        bst.put("d", 4);
        System.out.println("size: " + bst.size());
        System.out.println("Get 'a': " + bst.get("a"));
        System.out.println("Get 'b': " + bst.get("b"));
        System.out.println("Contains 'c': " + bst.contains("c"));
        System.out.println("Contains 'e': " + bst.contains("e"));
        bst.remove("b");
        System.out.println("size: " + bst.size());
        bst.put("f", 6);
        System.out.println("min value: " + bst.min());
        System.out.println("max value: " + bst.max());
    }
}
