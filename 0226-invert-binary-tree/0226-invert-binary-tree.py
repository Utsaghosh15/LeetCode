# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def invertBTree(self,node: TreeNode | None):
        if not node:
            return None
        
        self.invertBTree(node.left)
        self.invertBTree(node.right)

        temp_node = node.left
        node.left = node.right
        node.right = temp_node

        return

    def invertTree(self, root: TreeNode | None) -> TreeNode | None:
        
        self.invertBTree(root)

        return root