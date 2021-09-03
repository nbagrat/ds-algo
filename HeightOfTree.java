/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	if(root == null){
          return 0;
        }else{
            int leftHeight = root.left == null?0: (height(root.left) + 1);
            int rightHeight = root.right == null? 0:(height(root.right) + 1);
            return Math.max(leftHeight,rightHeight);
        }
    }
