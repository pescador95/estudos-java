package src.desafios;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, int left, int right) {
        this.val = val;
        this.left = new TreeNode(left);
        this.right = new TreeNode(right);
    }

    static TreeNode treeNode(TreeNode tree, int left, int right) {
        tree.left = new TreeNode(left);
        tree.right = new TreeNode(right);
        return tree;
    }

    public static void main(String... args) {


      TreeNode root = old();
      TreeNode rootx = newest();


      execute(root);
      execute(rootx);
    }

    public static void execute(TreeNode root) {
        TreeNode invertedRoot = invertTree(root);
        printTree(invertedRoot);
    }

    public static TreeNode old() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }

    public static TreeNode newest() {
        TreeNode root = new TreeNode(1, 2, 3);

        root.left = treeNode(root.left, 4, 5);
        root.right = treeNode(root.right, 6, 7);
        root.left.left = treeNode(root.left.left, 8, 8);
        root.left.right = treeNode(root.left.right, 9, 9);
        root.right.left = treeNode(root.right.left, 0, 0);
        root.right.right = treeNode(root.right.right, 0, 0);
        return root;
    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;

        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
