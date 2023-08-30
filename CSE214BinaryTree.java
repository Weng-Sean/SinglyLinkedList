public class CSE214BinaryTree<T> implements CSE214Tree<T>{
    class Node{
        private T element;
        private Node leftChild;
        private Node rightChild;
        private Node rightSibling;

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node getLeftChild() {
            return leftChild;
        }

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }

        public Node getRightChild() {
            return rightChild;
        }

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }

        public Node getRightSibling() {
            return rightSibling;
        }

        public void setRightSibling(Node rightSibling) {
            this.rightSibling = rightSibling;
        }

        public Node(T element){
            this.element = element;
        }
        public Node(T element, Node leftChild, Node rightChild){
            this.element = element;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public int totalChildren(){
            if(leftChild == null && rightChild == null)
                return 0;
            else if(leftChild == null || rightChild == null)
                return 1;
            return 2+leftChild.totalChildren() + rightChild.totalChildren();

        }
        public String preorder(){
            String result = element + ", ";
            if (leftChild != null){
                result += leftChild.preorder();
            }
            if(rightChild != null){
                result += rightChild.preorder();
            }
            return result;
        }
        public String postorder(){
            String result = "";
            if (leftChild != null)
                result += leftChild.postorder();
            if(rightChild != null)
                result += rightChild.postorder();
            result = result + element + ", ";
            return result;

        }
        public String inorder(){
            String result = "";
            if(leftChild!=null)
                result += leftChild.inorder();
            result = result + element + ", ";
            if(rightChild!=null)
                result += rightChild.inorder();
            return result;
        }
    }
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public CSE214BinaryTree(){

    }
    public CSE214BinaryTree(T... elements){
        int nodeNum = elements.length;
        Object[] nodes = new Object[nodeNum];

        for (int i = 0; i < nodeNum; i++){
            nodes[i] = new Node(elements[i]);
        }

        root = (Node)nodes[0];
        for(int i = 0; i < nodeNum/2; i++){
            int leftIndex = 2*i+1;
            int rightIndex = 2*i+2;
            if(leftIndex < nodeNum){
                ((Node)nodes[i]).leftChild = (Node)nodes[leftIndex];
            }
            if(rightIndex < nodeNum){
                ((Node)nodes[i]).rightChild = (Node)nodes[rightIndex];
            }
        }
    }
    public String preorder(){
        String result = root.preorder();
        result = result.substring(0,result.length()-2);
        System.out.println(result);
        return result;
    }

    public String postorder(){
        String result = root.postorder();
        result = result.substring(0,result.length()-2);
        System.out.println(result);
        return result;
    }
    public String inorder(){
        String result = root.inorder();
        result = result.substring(0,result.length()-2);
        System.out.println(result);
        return result;
    }
    public int numNodes(){

        return 1+root.totalChildren();
    }
    public int depth(){
        return depth(root);
    }
    public int depth(Node root){
        if (root == null)
            return 0;
        return (1+Math.max(depth(root.leftChild), depth(root.rightChild)));
    }



}
