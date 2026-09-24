# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:

    def maxDepthTree(self,node: TreeNode | None) -> int:
        if not node:
            return 0

        return max(self.maxDepthTree(node.left),self.maxDepthTree(node.right))+1

    def maxDepth(self, root: TreeNode | None) -> int:
        return self.maxDepthTree(root)    